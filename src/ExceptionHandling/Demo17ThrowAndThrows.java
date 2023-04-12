package ExceptionHandling;

public class Demo17ThrowAndThrows {
    public static void main(String[] args) {
        m1();
    }
    private static void m1() throws ArithmeticException {
        throw new ArithmeticException("divide by zero");// explicitly throwing the exception
    }
}
