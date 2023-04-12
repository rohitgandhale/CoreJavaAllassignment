package OOPS.inheritance;

public class B extends A {
    int c=300;
    int d=400;
    int e=222;
    public B(){
        super();
        System.out.println("B");
    }
    void m3(){System.out.println("m3 in B");}
    void m4(){System.out.println("m4 in B");}
    void m5(){
        System.out.println("m5 in B");
    }
}
