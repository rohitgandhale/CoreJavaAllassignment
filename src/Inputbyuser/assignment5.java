package Inputbyuser;
import java.util.Scanner;
public class assignment5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("side of square");
        int a = s.nextInt();
        System.out.println("area of square=" + a*a);
        System.out.println("perimeter of square=" + 4*a);
    }
}

