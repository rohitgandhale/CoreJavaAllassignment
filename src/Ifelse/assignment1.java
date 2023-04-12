package Ifelse;
import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("length");
        int a=s.nextInt();
        System.out.println("breadth");
        int b=s.nextInt();
        if (a==b){
            System.out.println("it is square");
        } else
        {
                System.out.println("it is rectangle");
        }
    }
}
