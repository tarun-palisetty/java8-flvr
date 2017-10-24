package com.sample.utils.optional;

import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class Optional8 {

    public static void main(String[] args) {

        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.of("Java optional example");

        // using orElse method
        String str1 = optional1.orElse("orElse example");
        System.out.println(str1);

        String str2 = optional2.orElse("Otional orElse example");
        System.out.println(str2);

        String str3 = optional1.orElseGet(() -> "orElseGet example");
        System.out.println(str3);

        String str4 = optional2.orElseGet(() -> "orElseGet example");
        System.out.println(str4);


        try {
            String str5 = optional1.orElseThrow(() -> new Exception("Value is not present in Optional"));
            System.out.println(str5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String str6 = optional2.orElseThrow(() -> new Exception("Value is not present in Optional"));
            System.out.println(str6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
