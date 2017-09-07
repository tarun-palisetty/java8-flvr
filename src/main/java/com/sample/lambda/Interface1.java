package com.sample.lambda;

import java.util.Map;

/**
 * Created by tarun on 07/09/2017.
 */
public class Interface1 {

    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }

        static int positive(int a) {
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        Formula f1 = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 1000);
            }
        };

        f1.calculate(100);
        f1.sqrt(-23);
        Formula.positive(-4);
    }
}
