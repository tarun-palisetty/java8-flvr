package com.sample.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tarun on 07/09/2017.
 */
public class StaticMethod {

    @AllArgsConstructor
    @Getter
    @ToString
    static class Car {
        String model;
        String make;
        int CC;
        int year;

    }

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>(4);

        cars.add(new Car("Mazda 3", "Mazda", 1600, 2008));
        cars.add(new Car("Mazda 6", "Mazda", 2500, 2009));
        cars.add(new Car("Mazda 2", "Mazda", 1400, 2008));
        cars.add(new Car("Mazda X5", "Mazda", 3600, 2014));

        Predicate<Car> pred = (c) -> c.getCC() > 3000 && c.getYear() <= 2014;

        cars.forEach((Car c) -> {
            if (pred.test(c)) {
                System.out.println(c.toString());
            }
        });
    }
}
