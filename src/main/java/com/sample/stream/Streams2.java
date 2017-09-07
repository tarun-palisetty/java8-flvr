package com.sample.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Created by tarun on 06/09/2017.
 */
public class Streams2 {

    public static final int MAX = 1000000;

    public static void main(String[] args) {
        sortSequential();
        sortParallel();
    }

    private static void sortSequential() {
        List<String> values = new ArrayList<>(MAX);

        for (int i=0 ; i<MAX ; i++ ){
            UUID id = UUID.randomUUID();
            values.add(id.toString());
        }

        long t0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("Sequential sort took: %d ms", millis));
    }

    private static void sortParallel() {
        List<String> values = new ArrayList<>(MAX);
        for (int i=0 ; i<MAX ; i++ ){
            values.add(UUID.randomUUID().toString());
        }

        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 -t0);
        System.out.println(String.format("Parallel sort took: %d ms", millis));
    }
}
