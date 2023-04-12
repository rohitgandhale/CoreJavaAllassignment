package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo9FOSHugeData {
    public static void main(String[] args) throws IOException {
        File file=new File("hugeData.txt");
        System.out.println("is file created "+file.createNewFile());
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        LocalDateTime startTime=LocalDateTime.now();
        System.out.println("write operation started at "+startTime);
        for (int i = 0; i <1000000 ; i++) {
            fileOutputStream.write('A');
        }
        LocalDateTime endTime=LocalDateTime.now();
        System.out.println("write operation completed "+endTime);
        fileOutputStream.close();
        System.out.println("write operation completed");
    }
}
