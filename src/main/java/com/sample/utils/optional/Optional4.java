package com.sample.utils.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class Optional4 {

    public static void main(String[] args) {
        String[] strs = new String[10];

        //strs[5] = "JAVA OPTIONAL EXAMPLE";

        Optional<String> checkNull = Optional.ofNullable(strs[5]);

        System.out.println(checkNull.orElse("Empty string ..."));

        if (checkNull.isPresent()) {
            System.out.println(checkNull.get());
        }


    }
}
