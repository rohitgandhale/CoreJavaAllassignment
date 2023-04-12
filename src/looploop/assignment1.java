package looploop;
import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i <10 ; i++) {
            System.out.println("enter a number");
            int number=s.nextInt();
            sum=sum+number;
        }
        System.out.println("sum is="+sum);
        System.out.println("average value="+sum/10);

    }
}
