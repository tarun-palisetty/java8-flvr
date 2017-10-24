package com.sample.utils.consumer;

import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

/**
 *
 *  This functional interface represents an operation that accepts a single input argument and returns no result.
 *  The real outcome is the side-effects it produces. Since it's a functional interface,
 *  you can pass a lambda expression wherever a Consumer is expected.
 */
public class ConsumerEx1 {

    public static void main(String[] args) {
        Consumer<Product> updatePrice = p -> p.setPrice(5.9);

        Product p = new Product();
        updatePrice.accept(p);
        System.out.println(p.getPrice());
    }
}

@Setter
@Getter
class Product {

    private double price = 0.0;
}
