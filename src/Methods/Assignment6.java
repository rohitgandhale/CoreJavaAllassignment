package Methods;

import java.util.Scanner;

public class Assignment6 {
    public static void Circle(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Radius");
        int a=s.nextInt();
        double areaofcircle=(3.14)*(a*a);
        double circum=2*(3.14)*a;
        System.out.println("Area="+areaofcircle);
        System.out.println("Circumference="+circum);
    }

    public static void main(String[] args) {
        Circle();
    }
}
