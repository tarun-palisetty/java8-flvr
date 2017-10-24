package com.sample.utils.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by tarun on 06/09/2017.
 */
public class Optional2 {

    static class Inner {
        String foo = "boo";

        public String getFoo() {
            return "foo";
        }
    }

    static class Nested {
        Inner inner = new Inner();

        public Inner getInner() {
            return inner;
        }
    }

    static class Outer {
        Nested nested = new Nested();

        public Nested getNested() {
            return nested;
        }
    }

    public static void main(String[] args) {

    }

}
