package looploop;

import java.util.Scanner;

public class assignment20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a positive number");
        int n=s.nextInt();
        if (n>=1){
            for (int i = 1; i <=10 ; i++) {
                System.out.println(n*i);
            }
        }else {
            System.out.println("it is an negative number");
        }
    }
}
