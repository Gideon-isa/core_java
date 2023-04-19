package streamIO;

import java.io.*;
import java.util.Arrays;

public class ByteSream {
    public static void main(String[] args) {

        byte[] myArray = new byte[20];
        System.out.println(Arrays.toString(myArray));
//        try(InputStream input = new FileInputStream("/streamIO/text.txt")) {
//            int n = input.read(myArray);
//            System.out.println(input.available());
//        }catch (FileNotFoundException e) {
//           e.getMessage();
//        }catch (IOException e) {
//            e.getMessage();
//        }
        InputStream input = null;
        try{
            input = new FileInputStream("C:\\Users\\SDSD\\Documents\\NewTextDocument.txt");
            input.read(myArray);
        }catch (FileNotFoundException e) {
            e.getMessage();
        }catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }

        System.out.println(new String(myArray));
    }
}
