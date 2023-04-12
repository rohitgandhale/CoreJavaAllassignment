package OOPS.Interface;

public class functionalIimplementation {
    public static void main(String[] args) {
        I i = new A();
        i.m1();
        I i1=new I (){

            @Override
            public void m1() {
                System.out.println("Anonymous class");
            }
        };
     i1.m1();
        I i2=()->{
            System.out.println("lambda expressions");
        };
        i2.m1();
    }
}




