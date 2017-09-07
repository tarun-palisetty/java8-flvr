package com.sample.stream;

import java.io.InputStream;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by tarun on 07/09/2017.
 */
public class Streams3 {

    public static void main(String[] args) {

        for (int i=0 ; i<10 ; i++) {
            if (i %2 == 1) {
                System.out.println(i);
            }
        }

        IntStream.range(1, 10)
                .forEach(i -> {
                    if (i % 2 == 1) {
                        System.out.println(i);
                    }
                });

        IntStream.range(1, 10)
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);

        OptionalInt reduced1 =
                IntStream.range(0, 10)
                    .reduce((a, b) -> a + b);
        System.out.println(reduced1.getAsInt());

        int reduced2 =
                IntStream.range(0, 10)
                    .reduce(7, (a, b) -> a + b);
        System.out.println(reduced2);

    }
}
