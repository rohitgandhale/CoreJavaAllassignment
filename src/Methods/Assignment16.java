package Methods;

public class Assignment16 {
    void print(byte a){
        System.out.println(a);

    }void print(short a){
        System.out.println(a);
    }void print(int a){
        System.out.println(a);
    }void print(long a){
        System.out.println(a);
    }void print(double a){
        System.out.println(a);
    }void print(float a){
        System.out.println(a);
    }void print(char a){
        System.out.println(a);
    }void print(boolean a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Assignment16 a=new Assignment16();
        a.print(-10);
        a.print(-10000);
        a.print(123);
        a.print(1234567890);
        a.print(1.2345);
        a.print(0.2289);
        a.print('R');
        a.print(true);
    }

}
