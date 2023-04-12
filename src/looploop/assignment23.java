package looploop;

import java.util.Scanner;

public class assignment23 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a= s.nextInt();
        boolean isperfect=true;
        int sum=0;
        for (int i = 1; i <=a/2 ; i++) {
            if (a%i==0){
                sum+=i;
            }
        }
        if (sum!=a){
            System.out.println("it is not perfect");
        }else {
            System.out.println("it is perfect");
        }
    }
}
