package Methods;

public class Assignment18 {
    void SquareReactangle(int length, int breadth){
        int Area= length*breadth;
        System.out.println("Area of rectangle="+Area);
    }
    void RectangleSquare(int side){
        int Area=side*side;
        System.out.println("Area of square="+Area);
    }

    public static void main(String[] args) {
        Assignment18 assignment18=new Assignment18();
        assignment18.SquareReactangle(2,3);
        assignment18.RectangleSquare(2);

    }
}
