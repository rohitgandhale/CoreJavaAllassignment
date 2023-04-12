package ClassAndobjects;

public class Triangle1 {
    int side1;
    int side2;
    int side3;
    public Triangle1(int side1,int side2,int side3){
       this. side1=side1;
       this. side2=side2;
       this. side3=side3;
    }
    int getArea(){
        return side1*side2*side3;
    }
    int getPerimeter(){
        return side1+side2+side3;
    }

    public static void main(String[] args) {
        Triangle1 triangle1=new Triangle1(3,4,5);

        System.out.println("Area="+triangle1.getArea());
        System.out.println("Perimeter="+triangle1.getPerimeter());
    }
}
