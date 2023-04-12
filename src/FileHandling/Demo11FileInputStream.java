package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo11FileInputStream {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("sourceFile.txt");
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        File destinationFile = new File("destination.txt");
        System.out.println("destination file created " + destinationFile.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);


        //file copy operation
        System.out.println("File copy operation started at " + LocalDateTime.now());
        int data = fileInputStream.read();
        while (data != -1) ;
        {
            fileOutputStream.write(data);
            data = fileInputStream.read();
        }
        System.out.println("File copy completed at " + LocalDateTime.now());
        fileInputStream.close();
        fileOutputStream.close();
    }
}
