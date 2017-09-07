package com.sample.maps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by tarun on 07/09/2017.
 */

@AllArgsConstructor
@Getter
@ToString
public class Student {

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String firstName;
    private String lastName;
    private int score;




}
