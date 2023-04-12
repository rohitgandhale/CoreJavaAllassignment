package FileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo10 {
    public static void main(String[] args) throws IOException {
        File file=new File("rohit.txt");
        boolean isFilecreated= file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        LocalDateTime StartTime=LocalDateTime.now();
        System.out.println("execution started at "+StartTime);
        for (int i = 0; i <100000000 ; i++) {
            bufferedOutputStream.write('R');
        }
        LocalDateTime endtime=LocalDateTime.now();
        System.out.println("operation ended at "+endtime);
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("operation completed");

    }
}
