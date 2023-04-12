package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List arraylist=new ArrayList();
        arraylist.add(10);
        arraylist.add(10);
        arraylist.add("rohit");
        arraylist.add("rohit");
        arraylist.add(null);
        arraylist.add(null);
        arraylist.add(10.5f);
        arraylist.add(10.5d);
        arraylist.add(true);
        System.out.println(arraylist);
        System.out.println("no of collection "+arraylist.size());
         boolean isremoved=arraylist.remove("rohit");
        System.out.println(isremoved);
        arraylist.isEmpty();
        System.out.println(arraylist);
        arraylist.clear();
        System.out.println(arraylist);

    }
}
