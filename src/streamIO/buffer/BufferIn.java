package streamIO.buffer;

import java.io.*;

public class BufferIn {

    public static void main(String[] args) {

        try(InputStream inputStream = new FileInputStream("C:\\Users\\SDSD\\Documents\\NewTextDocument.txt");
            OutputStream outputStream = new FileOutputStream("C:\\Users\\SDSD\\Documents\\NewTextDocumentOut.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {

            byte[] bytes = new byte[200];
            //
            bufferedInputStream.read(bytes, 0, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            //bufferedOutputStream.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }



    }
}
