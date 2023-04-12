package ExceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("divisor is zero");
            System.out.println(10/0);
        }finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}
