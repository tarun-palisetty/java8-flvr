package com.sample.utils.optional;

import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class Optional5 {

    public static void main(String[] args) {
        Optional5 java8Optional = new Optional5();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // ofNullable allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);

        // of throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println(sum(a, b));
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {

        System.out.println(a.isPresent());
        System.out.println(b.isPresent());

        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.orElse(new Integer(0));

        return value1 + value2;

    }
}
