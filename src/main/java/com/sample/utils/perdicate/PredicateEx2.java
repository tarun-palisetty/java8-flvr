package com.sample.utils.perdicate;


import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 *
 *  A predicate is a statement that may be true or false depending on the values of its variables.
 *  It can be thought of as a function that returns a value that is either true or false.
 *
 */
public class PredicateEx2 {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("successfully");
        lst.add("easy");
        lst.add("fortune");

        List<String> filtered = lst.stream().filter(s -> s.length() > 5).collect(toList());
        System.out.println(filtered);
    }
}
