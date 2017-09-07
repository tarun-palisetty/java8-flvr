package com.sample.stream;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by tarun on 06/09/2017.
 */
public class Streams1 {

    public static void main(String[] args) {
        List<String> strCollection = new ArrayList<>();
        strCollection.add("ddd2");
        strCollection.add("aaa2");
        strCollection.add("bbb1");
        strCollection.add("aaa1");
        strCollection.add("bbb3");
        strCollection.add("ccc");
        strCollection.add("bbb2");
        strCollection.add("ddd1");

        // filtering
        strCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        // sorting
        strCollection
                .stream()
                .sorted()
                .forEach(System.out::println);

        // sorting with filter
        strCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        // mapping
        strCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        // Matching
        boolean anyStartsWithA = strCollection
                                    .stream()
                                    .anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);

        boolean allStartsWithA = strCollection
                                    .stream()
                                    .allMatch((s) -> s.startsWith("a"));
        System.out.println(allStartsWithA);

        boolean noneStartWithZ = strCollection
                                    .stream()
                                    .noneMatch((s) -> s.startsWith("z"));
        System.out.println(noneStartWithZ);

        // Counting
        long startsWithB = strCollection
                                .stream()
                                .filter((s) -> s.startsWith("b"))
                                .count();
        System.out.println(startsWithB);

        // Reducing
        Optional<String> reduced = strCollection
                                    .stream()
                                    .sorted()
                                    .reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);
    }
}
