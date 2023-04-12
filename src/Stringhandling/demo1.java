package Stringhandling;

public class demo1 {
    public static void main(String[] args) {
        //using new keyword objects will create in heap memory area
        String str=new String("abc");
        System.out.println(str);
        //using literal way
        //literal way string class objects will be stored in SCP and not in heap
        String str2="abc";
    }
}
