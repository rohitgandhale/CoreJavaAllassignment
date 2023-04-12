package FileHandling;

import java.io.File;

public class Demo5FilesInFolder {
    public static void main(String[] args) {
        File folder=new File("src/ARRAY");
        System.out.println("Is folder "+folder.isDirectory());
        String[] filenames = folder.list();
        System.out.println("total no of files available in folder "+filenames.length);
        for (String filename:filenames) {
            System.out.println(filename);
        }
    }
}
