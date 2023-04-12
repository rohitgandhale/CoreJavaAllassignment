package ExceptionHandling;

public class Demo13OrderOfCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/1);
            String str=null;
            System.out.println(str.length());
        }catch (ArithmeticException ae){
            System.out.println("divisor is zero");
        }catch (NullPointerException ne){
            System.out.println("don't try to play with null");
        }catch (Exception e){
            System.out.println("generic handler");
        }
        System.out.println("rest of the code");
    }
}
