package ClassAndobjects;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int Area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int length=s.nextInt();
        int breadth=s.nextInt() ;
        Rectangle rectangle=new Rectangle(length,breadth);
        System.out.println("Area of Rectangle="+rectangle.Area());
    }
}
