package collectionframework.list;

import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        List <String> myList =  List.of(
                "My",
                "Name",
                "Is",
                "Gideon"
        );

        for (String my :myList) {
            System.out.println(my);
        }



    }
}
