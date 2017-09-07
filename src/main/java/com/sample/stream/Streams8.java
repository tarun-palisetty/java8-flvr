package com.sample.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tarun on 07/09/2017.
 */
public class Streams8 {



    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Max", 18),
                new Person("Pete", 23),
                new Person("Dave", 12),
                new Person("Sam", 23),
                new Person("Pat", 24)
        );

        test1(persons);
        test2(persons);
        test3(persons);
        test4(persons);
        test5(persons);
        test6(persons);
    }

    private static void test1(List<Person> persons) {
        List<Person> filtered = persons
                                    .stream()
                                    .filter(p -> p.name.startsWith("P"))
                                    .collect(Collectors.toList());

        System.out.println(filtered);
    }

    private static void test2(List<Person> persons) {
        Map<Integer, List<Person>> personsByAge = persons
                                                    .stream()
                                                    .collect(Collectors.groupingBy(p -> p.age));

        personsByAge
                .forEach((age, p) -> System.out.printf("age %s: %s\n", age, p));
    }

    private static void test3(List<Person> persons) {
        Double avgAge = persons
                            .stream()
                            .collect(Collectors.averagingInt(p -> p.age));

        System.out.println("Average age is: " + avgAge);
    }

    private static void test4(List<Person> persons) {
        IntSummaryStatistics ageSummary = persons
                                            .stream()
                                            .collect(Collectors.summarizingInt(p -> p.age));

        System.out.println("Age statistics: " + ageSummary);
    }

    private static void test5(List<Person> persons) {
        String names = persons
                            .stream()
                            .filter(p -> p.age >= 18)
                            .map(p -> p.name)
                            .collect(Collectors.joining(" and ", "In UK ", " are of legal age."));

        System.out.println("Name: " + names);
    }

    private static void test6(List<Person> persons) {
        Map<Integer, String> map = persons
                                        .stream()
                                        .collect(Collectors.toMap(
                                                p -> p.age,
                                                p -> p.name,
                                                (name1, name2) -> name1 + ";" + name2));

        System.out.println("Group by age: "+ map);
    }

}
