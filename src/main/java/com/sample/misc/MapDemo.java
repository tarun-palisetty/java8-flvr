package com.sample.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tarun on 06/09/2017.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        for (int i=0 ; i<10 ; i++ ) {
            map.putIfAbsent(i, "val" + i);
        }

        // forEach
        map.forEach((id, val) -> System.out.println(val));

        map.computeIfPresent(4, (num, val) -> val + num);
        System.out.println(map.get(4));

        System.out.println(map.getOrDefault(33, "Not found !!!"));

        map.merge(9, "newVal9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));
    }
}
