package com.sample.utils.optional.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by tarun on 24/10/2017.
 */

@AllArgsConstructor
@Getter
@ToString
public class Address {

    public static final Address EMPTY_ADDRESS = new Address("", "", "", 0);
    private final String line1;
    private final String city;
    private final String country;
    private final int zipcode;

}
