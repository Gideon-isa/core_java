package myinterface.comparable;

/**
 *
 *
 * 5 May 2023
 * Gideon
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee [4];

        employees[0] = new Employee(10, "Mikey", 25, 10000);
        employees[1] = new Employee(20, "Arun", 29, 20000);
        employees[2] = new Employee(5, "Lisa", 35, 5000);
        employees[3] = new Employee(1, "Pankaj", 32, 50000);

        System.out.println("Before Sorting");
        for (Employee e: employees) {
            System.out.println(e);
        }

        Arrays.sort(employees);

        System.out.println("\n After sorting");

        for (Employee e: employees) {
            System.out.println(e);
        }
        System.out.println("\n\n");

        ArrayList<Member> members = new ArrayList<>();
                members.add(new Member("Gideon", 50));
                members.add(new Member("Jonah", 40));
                members.add(new Member("Mark", 4));
                members.add(new Member("Peter", 90));
                members.add(new Member("John", 95));

        // Before sorting
        System.out.println("Before sorting");
        for (Member m: members) {
            System.out.println(m);
        }

        Collections.sort(members);

        // After sorting
        System.out.println("\n\n After sorting");
        for (Member m: members) {
            System.out.println(m);
        }




    }
}
