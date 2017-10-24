package com.sample.stream;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by tarun on 07/09/2017.
 */
public class ReaptingCharacter {

    public static void main(String[] args) {
        String stmt = "the quick brown fox jumped over the lazy dog" ;
        System.out.println(stmt.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Object::toString, Collectors.counting())));
    }
}
