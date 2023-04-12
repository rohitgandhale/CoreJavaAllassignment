package Methods;

import java.util.Scanner;

public class Assignment9 {
    static int Factorial(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=s.nextInt();
        int fact=1;
        for (int i = number; i >=1 ; i--) {
           fact=fact*i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial "+Factorial());
    }
}
