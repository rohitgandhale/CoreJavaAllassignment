package ClassAndobjects;

public class Triangle {
    int side1;
    int side2;
    int side3;

    public Triangle (int side1,int side2,int side3){

    }

    public Triangle() {

    }


    int Area(){
        return side1*side2*side3;
    }
    int Perimeter(){
        return side1+side2+side3;
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.side1=3;
        triangle.side2=4;
        triangle.side3=5;
        System.out.println("Area="+triangle.Area());
        System.out.println("perimeter="+triangle.Perimeter());
    }
}
