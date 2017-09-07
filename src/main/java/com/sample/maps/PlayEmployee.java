package com.sample.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by tarun on 07/09/2017.
 */
public class PlayEmployee {

    public PlayEmployee() {
        List<Employee> empList = new ArrayList<>();
        Employee emp = new Employee(1,"google",22342.23);
        Employee emp1 = new Employee(2,"ebay",42342.23);
        Employee emp2 = new Employee(3,"google",12342.23);
        Employee emp3 = new Employee(4,"ebay",62342.23);
        Employee emp4 = new Employee(5,"google",25342.23);
        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        System.out.println(empList);

        Collections.sort(empList, Comparator.comparing(Employee::getSalary));
        System.out.println(empList);
    }

    public static void main(String[] args) {

        PlayEmployee emp = new PlayEmployee();

    }
}
