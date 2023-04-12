package ExceptionHandling;

public class Demo16CheckedExceptionThrows {
    public static void main(String[] args) {
        try {
            Class.forName("ExceptionHandling.Demo1111");
        }catch (ClassNotFoundException e){
            System.out.println("invalid classname");
        }
        System.out.println("rest of the code");
    }

}
class Demo{
    static {
        System.out.println("demo class loaded into  memory");
    }
}
