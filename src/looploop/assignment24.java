package looploop;
import java.util.Scanner;
public class assignment24 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=s.nextInt();
        int b= s.nextInt();
        int product=0;
        for (int i = 1; i <=b ; i++) {
            product+=a;
            System.out.println("product of two numbers"+product);
        }
    }
}
