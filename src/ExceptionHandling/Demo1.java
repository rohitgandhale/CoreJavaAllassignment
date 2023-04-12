package ExceptionHandling;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println("Addition "+(num1+num2));
        System.out.println("Division "+(num1/num2));
        System.out.println("rest of the code..................");
    }
}
