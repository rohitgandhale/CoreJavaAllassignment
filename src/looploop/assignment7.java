package looploop;
import java.util.Scanner;
public class assignment7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int a = s.nextInt();
        long fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial of number=" + fact);
    }
}