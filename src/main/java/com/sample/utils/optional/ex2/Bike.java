package com.sample.utils.optional.ex2;

import com.sample.utils.optional.ex2.Wheels;
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
public class Bike {

    private Optional<Wheels> wheels;
    private String brand;



}
