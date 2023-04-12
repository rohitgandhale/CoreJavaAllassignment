package OOPS.ObjectClass;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a==b);
        Student  student1=new Student(1,"rohit");
        Student student2=new Student(1,"rohit");
       // student1=student2;
        System.out.println(student1==student2);//false
        System.out.println(student1.equals(student2));//false
        System.out.println(student1==student1);//true
        System.out.println(student1.equals(student1));//true
        System.out.println(10==10);


    }
}
