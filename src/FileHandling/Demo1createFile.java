package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1createFile {
    public static void main(String[] args) throws IOException {
        File file=new File("abc071222.txt");
        boolean isFileCreated= file.createNewFile();
        System.out.println(isFileCreated);
    }
}
