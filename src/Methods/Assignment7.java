package Methods;

import java.util.Scanner;

public class Assignment7 {

    public static boolean isPrime(int number){

        boolean isPrime=true;
        if (number>1){
            for (int i = 2; i <=number/2 ; i++) {
                if (number%i==0){
                     isPrime = false;
                    break;
                }
            }
        }return isPrime;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
    }
    
}
