package com.sample.utils.perdicate;

import java.util.function.Predicate;

/**
 * Created by tarun on 24/10/2017.
 */
public class PerdicateEx1 {

    public static void main(String[] args) {

        Predicate<String> isALongWord = new Predicate<String>() {

            public boolean test(String t) {
                return t.length() > 10;
            }
        };


        String s = "successfully";
        String s1 = "small";
        boolean result = isALongWord.test(s);
        System.out.println(result);

        boolean result1 = isALongWord.test(s1);
        System.out.println(result1);

    }
}
