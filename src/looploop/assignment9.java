package looploop;
import java.util.Scanner;
public class assignment9 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char a=' ';
        int count=0;
        int sum=0;
        int number=0;
        int product=1;
        do {
            System.out.println("enter the number");
            number=s.nextInt();
            sum=sum+number;
            product=product*number;
            count++;
            System.out.println("to stop press q or to continue press c");
            a=s.next().charAt(0);
        }while (a!='q' && a=='c');
        System.out.println("average="+sum/count);
        System.out.println("product="+product);
    }
}
