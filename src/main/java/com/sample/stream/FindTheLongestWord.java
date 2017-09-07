package com.sample.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarun on 07/09/2017.
 */
public class FindTheLongestWord {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("House");
        words.add("Looking");
        words.add("Chocolate");
        words.add("Globe");
        words.add("I");
        words.add("Pi");
        words.add("Sea");
        words.add("Dogs");
        words.add("Computers");
        words.add("References");


        String wrd = words
                        .stream()
                        .reduce((s1, s2) -> {
                            if (s1.length() > s2.length())
                                return s1;
                            else
                                return s2;
                        }).get();

        System.out.println("Longest word is: "+wrd);

        int len = words
                    .stream()
                    .mapToInt(String::length)
                    .reduce((s1, s2) -> {
                        if (s1 > s2) {
                            return s1;
                        } else {
                            return s2;
                        }
                    }).getAsInt();
        System.out.println("Longest word lenth is :" + len);
    }
}
