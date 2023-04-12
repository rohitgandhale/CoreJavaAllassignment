package operators;

public class operators10 {
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("swapping with 3 variables");
        System.out.println("a="+a);
        System.out.println("b="+b);
         a=6;
         b=8;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swapping without 3rd variable");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
