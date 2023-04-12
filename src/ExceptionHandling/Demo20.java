package ExceptionHandling;

public class Demo20 {
    public static void main(String[] args) {
        System.out.println(getValue());
    }
    //can we keep the statements after finally block
    //If the control is returning from finally block itself ?
    // Ans. No
    private static int getValue() {
       try {
           return 1;
       }catch (Exception e){
           return 2;
       }finally {
         //  return 3;
           //Does finally block gets executed if either try or catch block are returning the control
           //
           //Yes. finally block gets executed no matter whether try or catch block returning the control
           System.out.println("finally block");
       }

    }
}
