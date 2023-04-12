package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo14BufferdWriter {
    public static void main(String[] args) throws IOException {
        File file=new File("file-writer.txt");
        System.out.println("file created "+file.createNewFile());
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        System.out.println("write operation started at "+ LocalDateTime.now());
        for (int i = 0; i <500000000 ; i++) {
            bufferedWriter.write(" Rohit Eknath Gandhale ");
        }
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("write operation completed at "+LocalDateTime.now());
    }
}
