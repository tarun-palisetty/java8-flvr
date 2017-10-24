package com.sample.utils.optional;

import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class Optional9 {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Java Optional Example");

        // using filter() method
        Optional<String> str1 = optional.filter(s -> s.contains("Optional"));
        str1.ifPresent(System.out::println);

        // using map() method
        Optional<String> str2 = optional.map(String::toUpperCase);
        str2.ifPresent(System.out::println);

        // using flatMap() method
        Optional<String> str3 = optional.flatMap(s -> Optional.of(s + " flatMap() method"));
        str3.ifPresent(System.out::println);

    }
}
