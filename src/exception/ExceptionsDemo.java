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
        System.out.println("\nEnd of main ...");
    }

    private static void share()  throws FileNotFoundException , IOException{
        System.out.println("\nInside share ...");
        try {
            HttpConnect.send(1, "hello", "http://www.goodsnips.com");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Hello");
       }
        System.out.println("\nEnd of share ...");
    }
}
