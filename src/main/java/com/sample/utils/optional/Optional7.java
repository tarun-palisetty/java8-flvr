package com.sample.utils.optional;

import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class Optional7 {

    public static void main(String[] args) {

        // Creating empty Optional objects
        Optional<String> str = Optional.empty();
        Optional<Double> amt = Optional.empty();

        str.ifPresent(System.out::println);


        // Creating Optional objects
        Optional<String> str1 = Optional.of("Optional example class");
        Optional<Double> amt1 = Optional.of(45.51);

        str1.ifPresent(System.out::println);

        // Creating nullable Optional Object
        Optional<String> str2 = Optional.ofNullable(null);
        Optional<Double> amt2 = Optional.ofNullable(null);

        str2.ifPresent(System.out::println);

    }
}
