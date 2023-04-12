package OOPS.ObjectClass;

public class HashcodeMethodDemo {
    public static void main(String[] args) {
        Student student1=new Student(1, "Rohit");
        Student student2=new Student(1,"Rohit");
        student1=student2;
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
