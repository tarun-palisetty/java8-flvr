package com.sample.utils.optional.ex1;

import com.sample.utils.optional.ex1.Address;
import com.sample.utils.optional.ex1.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class OptionalPersonDemo {

    public static void main(String[] args) {
        Address address = new Address("52/A, 22nd Street", "Mumbai", "India", 400001);

        Person person1 = new Person("John", Optional.of(address), 786887);
        Person person2 = new Person("Mac", Optional.empty(), 232323);
        Person person3 = new Person("Tarun", Optional.empty(), 988766);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        persons.stream().forEach((p) -> {
            System.out.printf("%s from %s %n", p.getName(), p.getAddress().orElse(Address.EMPTY_ADDRESS), p.getPhone());
        });

    }

    /**
     * Created by tarun on 24/10/2017.
     */
    public static class NoBikeException extends Exception {

        private static final long serialVersionUID = 1L;
    }
}
