package Inputbyuser;
import java.util.Scanner;
public class assignment8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("first input");
        int a= s.nextInt();
        System.out.println("second output");
        int b= s.nextInt();
        System.out.println("third input");
        int c= s.nextInt();
        System.out.println("all are equal="+(a==b&&b==c&&a==c));
        System.out.println("any two are equal="+(a==b||b==c||a==c));
    }
}
