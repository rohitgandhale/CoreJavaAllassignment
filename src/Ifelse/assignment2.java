package Ifelse;
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("first value");
        int a=s.nextInt();
        System.out.println("second value");
        int b=s.nextInt();
        if (a>b) {
            System.out.println("greatest value="+a);
        }
            else{
                System.out.println("greatest value="+b);
            }

    }
}
