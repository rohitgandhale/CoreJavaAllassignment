package OOPS.inheritance;

public class Demo3rdcase {
    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.a);//100
        System.out.println(a.b);//200
        System.out.println(a.e);//111
        a.m1();//m1 in A
        a.m2();//m2 in A
        a.m5();//m5 in B
    }
}
