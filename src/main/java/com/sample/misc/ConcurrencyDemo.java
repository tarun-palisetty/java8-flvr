package com.sample.misc;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

/**
 * Created by tarun on 06/09/2017.
 */
public class ConcurrencyDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, UUID> concurrentHashMap = new ConcurrentHashMap<>();

        for (int i=0 ; i<100 ; i++) {
            concurrentHashMap.putIfAbsent(i, UUID.randomUUID());
        }

        int threshold = 1;

        concurrentHashMap.forEachValue(threshold, System.out::println);

        //forEach
        concurrentHashMap.forEach((id, uuid) -> {
            if (id % 10 == 0) {
                System.out.println(String.format("%s: %s", id , uuid));
            }
        });

        UUID searchResult = concurrentHashMap.search(threshold, (id, uuid) -> {
           if (String.valueOf(uuid).startsWith(String.valueOf(id))) {
               return uuid;
           }

           return null;
        });

        System.out.println("SearchResult: "+searchResult);

    }
}
