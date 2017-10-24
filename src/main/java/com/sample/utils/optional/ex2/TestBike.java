package com.sample.utils.optional.ex2;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */
public class TestBike {

    private static Bike colnagoBike = new Bike(Optional.of(new Wheels("mavic", 22)), "colnago");

    private static Bike nullBike = new Bike(null, "noWheels");

    private static Bike ofNullableBike = new Bike(Optional.ofNullable(null), "nowheels");

    public static void main(String[] args) {

        Optional<Bike> optionalEmptyBike = Optional.empty();

        try {
            Bike emptyBike = optionalEmptyBike.get();
        } catch (NoSuchElementException e) {
            System.out.println("get() on empty Optional throw java.util.NoSuchElementException" + e.getMessage());
        }

        if (!optionalEmptyBike.isPresent()) {
            System.out.println("isPresent() - check if object is not empty");
        }

        Bike orElseBike = optionalEmptyBike.orElse(colnagoBike);
        System.out.println("orElse() - Optional is empty so return colnagoBike " + orElseBike.getBrand());


    }
}
