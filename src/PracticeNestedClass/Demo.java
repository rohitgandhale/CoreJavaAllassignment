package PracticeNestedClass;

public class Demo {
    static class A {
       static int a = 5;
        String b = "Rohit";
    }

    class B{
        int c=10;
    }
    void m1(){
        class C{
            int d=123;
        }

    }

    public static void main(String[] args) {
        Demo.A demo=new Demo.A();
        System.out.println(demo.a);
        System.out.println(demo.b);
        Demo demo2=new Demo();
        demo2.m1();



    }
}
