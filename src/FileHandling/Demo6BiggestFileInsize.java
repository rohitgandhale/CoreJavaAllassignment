package FileHandling;

import java.io.File;

public class Demo6BiggestFileInsize {
    public static void main(String[] args) {
        File folder=new File("src/ARRAY");
        File[] files=folder.listFiles();
        File biggestfile=files[0];
        for (File file:files) {
            if (biggestfile.length() < file.length()){
                biggestfile=file;
            }
            System.out.println(file.getName()+"\t"+file.length());
        }
        System.out.println("Biggest file is "+biggestfile.getName()+"\t"+biggestfile.length());
    }
}
