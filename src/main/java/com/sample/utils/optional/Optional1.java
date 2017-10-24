package com.sample.utils.optional;

import java.util.Optional;

/**
 * Created by tarun on 06/09/2017.
 */
public class Optional1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();
        optional.get();
        optional.orElse("fallback");

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));
    }
}
