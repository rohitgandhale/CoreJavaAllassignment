package looploop;

public class assignment14 {
    public static void main(String[] args) {
        for (int number = 1; number <=100 ; number++) {
            if (isPrime(number)){
                System.out.println(number);
            }
        }
    }
    private static boolean isPrime(int number){
        boolean isPrime=true;
        for (int i = 2; i <=number/2 ; i++) {
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
