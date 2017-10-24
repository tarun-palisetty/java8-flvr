package com.sample.functionalinterface;

/**
 *
 * This functional interface represents a function that accepts one argument and produces a result.
 * One use, for example, it's to convert or transform from one object to another.
 * Since it's a functional interface, you can pass a lambda expression wherever a Function is expected.
 *
 *
 */

@FunctionalInterface
public interface VarArgInterface {

    String op(String... args);
}
