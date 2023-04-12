package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(10);
        integerList.add(12);
        integerList.add(13);
        integerList.add(14);
        integerList.add(45);
        integerList.add(23);
        integerList.forEach(System.out::println);
        System.out.println("sorted integer list");
        Collections.sort(integerList);
        integerList.forEach(System.out::println);
    }
}
