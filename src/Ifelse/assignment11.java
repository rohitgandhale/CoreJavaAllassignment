package Ifelse;
import java.util.Scanner;
public class assignment11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter year");
        int year=s.nextInt();
        if (year%400==0||(year%100!=0&&year%4==0)){
            System.out.println("its a leap year");
        }else
            System.out.println("its not leap year");
    }
}
