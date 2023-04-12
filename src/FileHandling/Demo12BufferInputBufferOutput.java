package FileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class Demo12BufferInputBufferOutput {
    public static void main(String[] args) throws IOException {
        File SourceFile=new File("sourceFile.txt");
        FileInputStream fileInputStream=new FileInputStream(SourceFile);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        File destinationfile=new File("Rg.txt");
        System.out.println("destination file created "+destinationfile.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(destinationfile);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

        System.out.println("file copy operation started at "+ LocalDateTime.now());
        int data=bufferedInputStream.read();
        while (data!=-1){
            bufferedOutputStream.write(data);
            data=bufferedInputStream.read();

        }
        System.out.println("file copy completed at "+LocalDateTime.now());
        fileInputStream.close();
        fileOutputStream.close();


    }
}
