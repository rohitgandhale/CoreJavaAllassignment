package ExceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/1);
            System.out.println("rest of the try");
        }catch (ArithmeticException ae) {
            System.out.println("divisor is zero");
            System.out.println(10/0);
        }
        System.out.println("rest of the code");
    }
}
