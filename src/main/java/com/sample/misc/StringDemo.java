package com.sample.misc;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tarun on 06/09/2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        testChars();
        testPatternSplit();
        testPatternPredicate();
        join();
    }

    private static void testChars() {
        String str = "foobar:foo:bar"
                .chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining());

        System.out.println(str);
    }

    private static void testPatternSplit() {
        String str = Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(s -> s.contains("bar"))
                .sorted()
                .collect(Collectors.joining(":"));

        System.out.println(str);
    }

    private static void testPatternPredicate() {
        long count = Stream.of("bob@gmail.com", "alice@hotmail.com")
                .filter(Pattern.compile(".*mail\\.com").asPredicate())
                .count();

        System.out.println(count);
    }

    private static void join() {
        String str = String.join(":", "foobar", "foo", "bar");
        System.out.println(str);
    }
}
