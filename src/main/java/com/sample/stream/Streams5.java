package com.sample.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by tarun on 07/09/2017.
 */
public class Streams5 {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        int[] ints = {1, 3, 5, 7, 11};

        Arrays
                .stream(ints)
                .average()
                .ifPresent(System.out::println);
    }

    private static void test2() {
        IntStream
                .builder()
                .add(1)
                .add(3)
                .add(5)
                .add(7)
                .add(11)
                .build()
                .average()
                .ifPresent(System.out::println);
    }

    private static void test3() {
        IntStream
                .range(0, 10)
                .average()
                .ifPresent(System.out::println);
    }

    private static void test4() {
        Stream
                .of(new BigDecimal("1.2"), new BigDecimal("3.7"))
                .mapToDouble(BigDecimal::doubleValue)
                .average()
                .ifPresent(System.out::println);
    }
}
