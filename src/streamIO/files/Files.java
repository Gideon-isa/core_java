package streamIO.files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Files {
    public static void main(String[] args) {
        try {
            File newFiles = new File("src\\streamIO\\files\\gola.txt");
            boolean isCreated = newFiles.createNewFile();
        }catch (NullPointerException | IOException e){
            e.printStackTrace();
        }

        //
        System.out.println(System.getProperty("user.dir"));
        


    }
}
