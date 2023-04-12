package OOPS.Abstraction;

public class C extends B {
    int a = 40;
    int c = 50;

    void display() {
        int a = 60;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}
