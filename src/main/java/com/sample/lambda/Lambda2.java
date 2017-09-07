package com.sample.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by tarun on 07/09/2017.
 */
public class Lambda2 {

    public static void main(String[] args) throws Exception {

        // Predicates
        Predicate<String> predicate = (s) -> s.length() > 0;

        System.out.println(predicate.test("foo"));
        System.out.println(predicate.negate().test("foo"));

        // Functions

        Function<String, Integer> toInteger = Integer::valueOf;

    }
}
