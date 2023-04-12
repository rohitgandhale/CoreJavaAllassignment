package Stringhandling;

public class Demo3 {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(str.toString());
        String greeting="good morning";
        System.out.println("length of string "+greeting.length());
        char[] array={};
        System.out.println(array.length);
        String str1="hello";
        System.out.println(str1);
        str1="hello again";
        System.out.println(str1);
        String name="abc ";
        name=name+"xyz ";
        name=name.concat("hello");
        System.out.println(name);
    }
}
