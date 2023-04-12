package Inputbyuser;
import java.util.Scanner;
public class assignment10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("marks of first subject");
        int a=s.nextInt();
        System.out.println("marks of second subject");
        int b=s.nextInt();
        System.out.println("marks of third subject");
        int c=s.nextInt();
        System.out.println("marks of fourth subject");
        int d=s.nextInt();
        int e=a+b+c+d;
        System.out.println("total marks="+e);
        System.out.println("percentage="+e*100/400);
    }
}
