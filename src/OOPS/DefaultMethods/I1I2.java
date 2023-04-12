package OOPS.DefaultMethods;

public class I1I2 implements I1,I2{


    @Override
    public void m1() {
        I1.super.m1();
        I2.super.m1();
    }

    public static void main(String[] args) {
        I1I2 i =new I1I2();
        i.m1();
    }
}
