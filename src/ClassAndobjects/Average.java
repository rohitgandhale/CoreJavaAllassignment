package ClassAndobjects;

import java.util.Scanner;

public class Average{
    int num1;
    int num2;
    int num3;

    public int getAverage(int num1,int num2,int num3) {
        int average=(num1+num2+num3)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Average average=new Average();
        System.out.println("average= "+average.getAverage(a,b,c));
    }
}
