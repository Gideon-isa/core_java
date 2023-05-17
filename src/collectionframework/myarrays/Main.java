package collectionframework.myarrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fish> fishes = Arrays.asList(
                new Fish("Tilapia", "salt-water"),
                new Fish("Sardine", "Salt-water")
        );

        List<String> myStrings = Arrays.asList("Marks", "Halo", "Persia", "Babylon", "Golang");

        int[] num1 = {1,2,3,45,6};
        int[] num2 = {45,67,89};

        

        //USING THE ITERATOR TO LOOP OVER THE LIST
        Iterator<String> iterator = myStrings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("before removing");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //iterator.remove();

        }

        System.out.println("\nafter removing");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nusing foreach");
        for (String test:myStrings) {
            System.out.println(test);
        }




    }
}
