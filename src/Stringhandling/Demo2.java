package Stringhandling;

public class Demo2 {
    public static void main(String[] args) {
        // with this line object is created one in heap and another in scp
        String str1=new String("abc");
        System.out.println("object created inside the heap "+System.identityHashCode(str1));
        //this will get reference of object created inside the SCP
        String intern=str1.intern();
        System.out.println("object created inside the scp "+System.identityHashCode(intern));
        String str2="abc";
        System.out.println("object created inside scp again "+System.identityHashCode(str2));
        String str3="abc";
        String str4="abc";
        String str5="abc";
        String str6=new String("abc");

    }
}
