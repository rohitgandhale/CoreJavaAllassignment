package OOPS.ObjectClass;

public class GetClassDemo {
    public static void main(String[] args) {
        GetClassDemo ref=new GetClassDemo();
        System.out.println(ref.getClass());
        Class classref=ref.getClass();
        System.out.println(classref.getName());
    }
}
