package com.sample.utils.optional.ex1;

import com.sample.utils.optional.ex1.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Optional;

/**
 * Created by tarun on 24/10/2017.
 */

@AllArgsConstructor
@Getter
@ToString
public class Person {

    private String name;
    private Optional<Address> address;
    private int phone;





}
