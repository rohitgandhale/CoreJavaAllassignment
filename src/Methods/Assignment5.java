package Methods;

import java.util.Scanner;

public class Assignment5 {
   public static int Product () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1=s.nextInt();
        System.out.println("Enter 2nd Number");
        int num2=s.nextInt();
        int Product=num1*num2;
        return Product;
    }

    public static void main(String[] args) {
        System.out.println("Product="+Product());
    }
}
