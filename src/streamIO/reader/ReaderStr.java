package streamIO.reader;

import java.io.*;

public class ReaderStr {
    //File readFileOne = new File("C:\\Users\\SDSD\\Documents\\NewTextDocument.txt");

    public static void main(String[] args) {
        try ( InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\SDSD\\Documents\\NewTextDocument.txt"));
              OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("C:\\Users\\SDSD\\Documents\\outputStreamWriter.txt"))) {
            char[] myChar = new char[500];
            in.read(myChar);
            out.write(myChar, 0, myChar.length);

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
