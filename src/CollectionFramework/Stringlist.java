package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Stringlist {
    public static void main(String[] args) {

        List<String> stringlist=new ArrayList<>();
        stringlist.add("cyber");
        stringlist.add("success");
        stringlist.add("java");
        stringlist.add("python");
        stringlist.add("testing");
        stringlist.add("cloud");
        // add, remove,search,traverse
        for (int index = 0; index <stringlist.size() ; index++) {
            System.out.println(stringlist.get(index));
        }
        System.out.println("*********foreach**********");
        stringlist.forEach (System.out::println);//method reference
        System.out.println("************after sorting***********");
        Collections.sort(stringlist);
        stringlist.forEach(System.out::println);
    }
}
