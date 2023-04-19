package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {
    public static void main(String[] args)  {
        System.out.println("\nInside main ...");
        try {
            share();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean answer = uncheckedE(0);

        System.out.println(answer);

        System.out.println("\nEnd of main ...");


    }

    /**
     *
     *
     */
    private static void share()  throws IOException{
        System.out.println("\nInside share ...");
        try {
            HttpConnect.send(4, "hello", "http://www.goodsnips.com");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Hello");
       }
        System.out.println("\nEnd of share ...");
    }

    private static boolean uncheckedE(int a) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }


}
