package Methods;

import java.util.Scanner;

public class Assignment1 {
    static int LargestNumber(int num1,int num2,int num3){
        if (num1>num2 && num1>num3){
            return num1;
        } else if (num2>num1 && num2>num3){
            return num2;
        }
        return num3;
    }
    static int SmallestNumber(int num1, int num2, int num3){
        if (num1<num2 && num1<num3){
            return num1;
        } else if (num2<num1 && num2<num3) {
            return  num2;
        }else
            return num3;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1=s.nextInt();
        int number2=s.nextInt();
        int number3=s.nextInt();
        System.out.println("Largest number is="+LargestNumber(number1,number2,number3));
        System.out.println("Smallest number is="+SmallestNumber(number1,number2,number3));
    }
}
