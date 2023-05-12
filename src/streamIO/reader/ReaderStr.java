package streamIO.reader;

import java.io.*;

public class ReaderStr {
    //File readFileOne = new File("C:\\Users\\SDSD\\Documents\\NewTextDocument.txt");

    public static void main(String[] args) {
//        try ( InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\SDSD\\Documents\\NewTextDocument.txt"));
//              OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("C:\\Users\\SDSD\\Documents\\outputStreamWriter.txt"))) {
//            char[] myChar = new char[500];
//            in.read(myChar);
//            out.write(myChar, 0, myChar.length);
//
//        }catch (IOException e) {
//            e.printStackTrace();
//        }


//        System.out.print("Enter you age?  ");
//        try(InputStreamReader in = new InputStreamReader(System.in);
//        OutputStreamWriter out = new OutputStreamWriter(System.out)) {
//            char[] myChar2 = new char[300];
//            in.read(myChar2);
//            out.write(myChar2);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }


        BufferedReader buf = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // Reading the string

        String str = "";
        try {
            str = buf.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                buf.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(str);


    }
}
