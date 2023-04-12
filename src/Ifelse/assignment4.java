package Ifelse;
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("salary");
        int salary=s.nextInt();
        System.out.println("year of service");
        int year=s.nextInt();
        if (year>5){
            System.out.println("bonus="+salary*0.5);
        }
        else;{
            System.out.println("no bonus");
        }
    }
}
