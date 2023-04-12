package looploop;
import java.util.Scanner;
public class assignment15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=s.nextInt();
        System.out.println("prime factor of "+number+" are");
        for (int i = 2; i <=number/2 ; i++) {
            if (number%i==0){
                if (isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
