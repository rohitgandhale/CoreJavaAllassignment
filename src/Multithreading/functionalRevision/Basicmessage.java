package Multithreading.functionalRevision;

public class Basicmessage {
    public static void main(String[] args) {
        Messageservice messageservice=new MessageServiceImpl();
        messageservice.m1();
        Messageservice messageservice1=new Messageservice() {
            @Override
            void m1() {
                System.out.println("anonymous class");
            }
        };
        messageservice1.m1();

    }
}
