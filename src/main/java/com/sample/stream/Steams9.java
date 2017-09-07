package com.sample.stream;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tarun on 07/09/2017.
 */
public class Steams9 {

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

    public static void main(String[] args){
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
    }

    private static void test1(List<Person> persons) {
        persons
                .stream()
                .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
                .ifPresent(System.out::println);
    }

    private static void test2(List<Person> persons) {
        Person result = persons
                            .stream()
                            .reduce(new Person("", 0), (p1, p2) -> {
                                p1.age += p2.age;
                                p1.name += p2.name;
                                return p1;
                            });

        System.out.printf("name=%s; age= %s\n", result.name, result.age);
    }

    private static void test3(List<Person> persons) {
        Integer ageSum = persons
                            .stream()
                            .reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);

        System.out.println("Ages sum: " + ageSum);
    }
}
