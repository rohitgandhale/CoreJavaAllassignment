package Stringhandling;

public class Demo9 {
    public static void main(String[] args) {
        String str1 = "   welcome to string handling chapter   ";
        System.out.println(str1.trim().toUpperCase());
        String str2 = "welcome:to:string:handling:chapter";
        System.out.println(str2.trim().replace(':', ' ').toUpperCase());
        String[] strings = str2.split(":");
        for ( String temp:strings) {
            System.out.println(temp);
        }
        System.out.println("printing integer array");
        int[] array={1,2,3,4,5};
        for (int temp:array) {
            System.out.print(temp+" ");
        }
        }

}
