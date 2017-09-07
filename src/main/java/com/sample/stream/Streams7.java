package com.sample.stream;

import java.util.Arrays;

/**
 * Created by tarun on 07/09/2017.
 */
public class Streams7 {
    public static void main(String[] args) {
        Arrays.asList("a1", "a3", "b1", "c2", "c1")
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
