package ExceptionHandling;

public class Demo2Error {
    public static void main(String[] args) {
        //we get stack overflow error.
      main(null);
    }
    private static void m1(){
        int variable=20;
        System.out.println("m1");
        m2();
    }
    private static void m2() {
        System.out.println("m2");
        int variable=30;
        m3();
    }

    private static void m3() {
        int variable=40;
        System.out.println("m3");
        m4();
    }

    private static void m4() {
        int variable=50;
        System.out.println("m4");
    }
}
