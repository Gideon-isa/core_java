package myinterface.comparable;

/**
 *
 * 5 May 2023
 */

import java.util.Comparator;

/**
 * Comparable interface which should be implemented by any custom class if we want to
 * use Arrays or Collections sorting methods. The Comparable interface has compareTo(T obj) method
 * which is used by sorting methods, you can check any Wrapper, String or Date class to confirm this.
 */
public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    /**
     * If the "this" object comes before the object received as a parameter in terms of sorting order,
     * the method should return a negative number. If, on the other hand,
     * the "this" object comes after the object received as a parameter, the method should return a positive number.
     * Otherwise, 0 is returned
     *
     * i.e.
     * @param em the object to be compared.
     * @return -1 if this is less than em
     * @return 1 if this is greater than em
     * @return 0 if this is equal to em
     */
    @Override
    public int compareTo(Employee em) {
        return (this.id - em.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    //Anonymous Class
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return 0;
        }
    };

}
