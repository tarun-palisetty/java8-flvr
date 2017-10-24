package com.sample.utils.optional;

import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class Optional3 {

    public static void main(String[] args) {
        String[] strs = new String[10];

        Optional<String> checkNull = Optional.ofNullable(strs[5]);

        if (checkNull.isPresent()) {
            String lowerCaseStr = strs[5].toLowerCase();
            System.out.println(lowerCaseStr);

        } else {
            System.out.println("String at index is not present ...");
        }
    }
}
