package FileHandling;

import java.io.File;

public class Demo2CreateFolder {
    public static void main(String[] args) {
        File directory=new File("directory1");
        boolean isDirectoryCreated=directory.mkdir();
        System.out.println(isDirectoryCreated);
    }
}
