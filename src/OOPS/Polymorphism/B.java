package OOPS.Polymorphism;

public class B extends A{
    int add(int a, int b){
        System.out.println("B class");
        return a+b;
    }
    float add(float a,float b){
        System.out.println("B class");
        return a+b;
    }

    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.add(2,4));
        System.out.println(b.add(12.20f,22.20f));
    }
}
