package Inputbyuser;
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("enter 1st number");
    int a= s.nextInt();
        System.out.println("enter 2nd number");
    int b= s.nextInt();
    int c=a+b;
    int d=a*b;
        System.out.println("sum="+c+"\nproduct="+d);
    }
}
