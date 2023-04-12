package ExceptionHandling;

public class Demo5HandleExceptionWithTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Developer written exception");
        }
        System.out.println("rest of the code");
    }
}
