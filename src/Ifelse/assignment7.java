package Ifelse;
import java.util.Scanner;
public class assignment7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value");
        int a=s.nextInt();
        if (a<0){
            System.out.println("absolute value="+(-1*a));
        }else {
            System.out.println("absolute value="+a);
        }
    }
}
