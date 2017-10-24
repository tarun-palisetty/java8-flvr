package com.sample.utils.supplier;

import java.util.function.Supplier;

/**
 *
 *  This functional interface does the opposite of the Consumer, it takes no arguments but it returns some value.
 *  It may return different values when it is being called more than once.
 *  Since it's a functional interface, you can pass a lambda expression wherever a Supplier is expected.
 *
 */
public class SupplierEx1 {

    static void display(Supplier<Integer>  arg) {
        System.out.println(arg.get());
    }

    public static void main(String[] args) {
        int n = 3;
        display(() -> n + 10);
        display(() -> n + 100);
    }
}
