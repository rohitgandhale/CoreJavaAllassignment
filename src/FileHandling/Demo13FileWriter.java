package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo13FileWriter {
    public static void main(String[] args) throws IOException {
        File file=new File("file-writer.txt");
        System.out.println("file created "+file.createNewFile());
        FileWriter fileWriter=new FileWriter(file);
        System.out.println("write operation started at "+ LocalDateTime.now());
        for (int i = 0; i <50000000 ; i++) {
            fileWriter.write(" Rohit Eknath Gandhale ");
        }
        fileWriter.close();
        System.out.println("write operation completed at "+LocalDateTime.now());
    }
}
