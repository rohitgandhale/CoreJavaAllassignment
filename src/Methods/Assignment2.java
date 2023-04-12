package Methods;

import java.util.Scanner;

public class Assignment2 {
    static int Oddeven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=s.nextInt();
        Oddeven(number);
    }
}
