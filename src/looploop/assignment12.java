package looploop;
import  java.util.Scanner;
public class assignment12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter any number");
        int a=s.nextInt();
        int sum=0;
        int input=a;
        while (input!=0){
            int lastdigit=input%10;
            sum=sum+lastdigit;
            input=input/10;
        }
        System.out.printf("sum of number="+sum);
    }

}
