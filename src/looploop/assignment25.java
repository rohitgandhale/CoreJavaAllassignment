package looploop;

import java.util.Scanner;

public class assignment25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter second number");
        int b=s.nextInt();
        int remainder=a;
        int count=0;
        while (remainder>b){
            remainder-=b;
            count++;
        }
        System.out.println("remainder="+remainder);
        System.out.println("qoutient="+count);
    }
}
