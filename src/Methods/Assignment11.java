package Methods;

import java.util.Scanner;

public class Assignment11 {
    public static boolean isPrime(int number){
        boolean isPrime=true;
        for (int i = 2; i <number/2 ; i++) {
            if (number%i==0);
            isPrime=false;
            break;
        }return isPrime;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int number=s.nextInt();
        System.out.println("Prime factors "+number+" are ");
        for (int i = 2; i <=number/2 ; i++) {
            if (number%i==0){
                if (isPrime(i)){
                    System.out.println(i+" ");
                }
            }
        }
    }
}



