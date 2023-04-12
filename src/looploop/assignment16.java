package looploop;
import java.util.Scanner;
public class assignment16 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int number=s.nextInt();
        int new_number=number;
        int evensum=0;
        int oddsum=0;
        while (new_number!=0){
            int digit=new_number%10;
            if (digit%2==0){
                evensum=evensum+digit;
            }else{
                oddsum=oddsum+digit;
            }
            new_number=new_number/10;
        }
        System.out.println("sum of odd digits "+number+"="+oddsum);
        System.out.println("sum of even digits "+number+"="+evensum);
    }
}
