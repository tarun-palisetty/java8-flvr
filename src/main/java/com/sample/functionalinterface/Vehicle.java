package com.sample.functionalinterface;

/**
 * Created by tarun on 07/09/2017.
 */
public interface Vehicle {

    void drive();

    default public void fly() {
        System.out.println("I can fly now...");
    }
}
