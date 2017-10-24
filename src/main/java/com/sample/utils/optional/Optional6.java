package com.sample.utils.optional;

import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class Optional6 {

    public static void main(String[] args) {

        // Creating empty Optional objects
        Optional<String> str = Optional.empty();
        Optional<Double> amt = Optional.empty();

        if (str.isPresent()) {
            System.out.println(str.get());
        }


        // Creating Optional objects
        Optional<String> str1 = Optional.of("Optional example class");
        Optional<Double> amt1 = Optional.of(45.51);

        if (str1.isPresent()) {
            System.out.println(str1.get());
        }

        // Creating nullable Optional Object
        Optional<String> str2 = Optional.ofNullable(null);
        Optional<Double> amt2 = Optional.ofNullable(null);

        if (str2.isPresent()) {
            System.out.println(str2.get());
        }

    }
}
