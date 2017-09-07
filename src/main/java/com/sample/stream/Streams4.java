package com.sample.stream;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by tarun on 07/09/2017.
 *
 * Testing order of execution
 */
public class Streams4 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("d2", "e4", "a2", "b1", "b3", "c");

        //test1(strings);
        //test2(strings);
        //test3(strings);
        //test4(strings);
        //test5(strings);
        test6(strings);
    }

    private static void test1(List<String> strCollection) {
        strCollection
                .stream()
                .filter(s -> {
                    System.out.println("filter:" + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: "+s));
    }

    private static void test2(List<String> strCollection) {
        strCollection
                .stream()
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    // sorted - Horizontal
    private static void test3(List<String> strCollection) {
        strCollection
                .stream()
                .sorted((s1, s2) -> {
                    System.out.printf("sorted: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.toLowerCase().startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    // short-circuit
    private static void test4(List<String> strCollection) {
        strCollection
                .stream()
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }

    private static void test5(List<String> strCollection) {
        Stream<String> stream = strCollection
                .stream()
                .filter(s -> s.startsWith("a"));

        stream.anyMatch(s -> true);
        stream.noneMatch(s -> true);
    }

    private static void test6(List<String> strCollection) {
        Supplier<Stream<String>> streamSupplier =
                () -> strCollection
                .stream()
                .filter(s -> s.startsWith("a"));

        streamSupplier.get().anyMatch(s -> true);
        streamSupplier.get().noneMatch(s -> true);
    }
}
