package looploop;

import java.util.Scanner;

public class assignment22b {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%2!=0){
                sum+=i;

            }
            System.out.println("sum of odd numbers"+sum);
        }
    }
}
