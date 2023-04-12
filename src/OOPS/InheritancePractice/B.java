package OOPS.InheritancePractice;

public class B extends A {
     int c=300;
     int d=400;
     int a=500;

    void m1() {
        System.out.println("m1 in B");
    }

    @Override
    void m2() {
        System.out.println("m2 in B");
    }
    void m4(){
        System.out.println("m4 inB");
    }
}
