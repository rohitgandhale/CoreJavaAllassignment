package Stringhandling;

public class Demo6Compareto {
    public static void main(String[] args) {
        String str1="A";
        String str2="a";
        //compareTo method returns integer value
        //It compares the string based on unicode/ascii value
        //positive : when 1st string is bigger than  compared to second
        //negative : when 1st string is smaller than compared to second
        System.out.println(str1.compareTo(str2));
    }
}
