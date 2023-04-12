package Stringhandling;

public class Demo5 {
    public static void main(String[] args) {
        String str1="hello";
        String str2="HELLO";
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//false
        System.out.println("without checking the case "+str1.equalsIgnoreCase(str2));

        String str3=new String("hello");
        String str4=new String("hello");
        System.out.println(str3==str4);//false
        System.out.println(str3.equals(str4));//true
        System.out.println(str3.equalsIgnoreCase(str4));//true

        String str5="hello";
        String str6="hello";
        System.out.println(str5==str6);
        System.out.println("str5 and str6 "+str5.equals(str6));




    }
}
