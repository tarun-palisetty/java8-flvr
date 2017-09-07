package com.sample.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by tarun on 07/09/2017.
 */
public class PlayStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Mc", "Donald", 10);
        Student student2 = new Student("Adrain", "Smith", 3);
        Student student3 = new Student("Steven", "McRoy", 30);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);


        Collections.sort(students, (s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));
        System.out.println("Sort by lastName: " + students);

        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()));
        System.out.println("Sort by score: " + students);

        students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));
        System.out.println("Sorting by lastName and then by firstName: "+ students);
    }
}
