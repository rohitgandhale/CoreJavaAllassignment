package ExceptionHandling;

import java.util.Scanner;

public class Demo18CustomException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two numbers");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        if (number2==0){
            throw new InvalidDivisorException("divisor is zero");
        }
        System.out.println("Division is "+number1/number2);
    }
}
