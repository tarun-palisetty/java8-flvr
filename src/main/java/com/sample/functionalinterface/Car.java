package com.sample.functionalinterface;

/**
 * Created by tarun on 07/09/2017.
 */
public class Car implements Vehicle {


    public void drive() {
        System.out.println("Driving forward...");
    }

    public static void main(String... args) {
        Car audi = new Car();
        audi.drive();
        audi.fly();
    }
}
