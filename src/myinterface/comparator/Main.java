package myinterface.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(30, "Gideon"));
        students.add(new Student(3, "Thompson"));
        students.add(new Student(9, "Mark"));
        students.add(new Student(15, "John"));
        students.add(new Student(20, "Benjamin"));


        System.out.println("Before Sorting the names");

        for (Student student: students) {
            System.out.println(student);
        }

        Collections.sort(students, new SortName());

        System.out.println("\n After Sorting by names");

        for (Student student: students) {
            System.out.println(student);
        }

//        System.out.println("Before Sorting the age");
//
//        for (Student student: students) {
//            System.out.println(student);
//        }
//
        // SORTING
        Collections.sort(students, new SortAge());

        System.out.println("\n After Sorting by age");

        for (Student student: students) {
            System.out.println(student);
        }
    }
}
