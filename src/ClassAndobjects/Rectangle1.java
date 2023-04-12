package ClassAndobjects;

public class Rectangle1 {
    int length;
    int breadth;
    public Rectangle1(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int Area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle1 rectangle1=new Rectangle1(4,5);
        Rectangle1 rectangle2=new Rectangle1(5,8);
        System.out.println("Area of 1st Rectangle="+rectangle1.Area());
        System.out.println("Area of 2nd Rectangle="+rectangle2.Area());
    }
}

