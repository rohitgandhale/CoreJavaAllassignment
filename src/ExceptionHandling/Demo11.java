package ExceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.exit(0);
            System.out.println("Catch");
        }finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}
