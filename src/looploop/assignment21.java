package looploop;

import java.util.Scanner;

public class assignment21 {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
            System.out.println(sum);
        }


    }


}
