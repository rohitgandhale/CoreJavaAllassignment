package Inputbyuser;
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("my name");
        String a=s.next();
        System.out.println("my roll number");
        int b=s.nextInt();
        System.out.println("my field of interest");
        String c=s.next();
        System.out.println("hey my name is "+a+" and my roll number "+b+" and my field of interest "+ c+".");

    }
}
