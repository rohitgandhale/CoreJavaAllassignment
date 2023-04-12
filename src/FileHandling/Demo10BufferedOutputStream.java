package FileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class Demo10BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        File file=new File("sourceFile.txt");
        System.out.println("is file created "+file.createNewFile());
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

        LocalDateTime startTime=LocalDateTime.now();
        System.out.println("write operation started at "+startTime);
        for (int i = 0; i <10000000 ; i++) {
            bufferedOutputStream.write('A');
        }
        LocalDateTime endTime=LocalDateTime.now();
        System.out.println("write operation completed "+endTime);
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("write operation completed and stream is closed ");
    }

}
