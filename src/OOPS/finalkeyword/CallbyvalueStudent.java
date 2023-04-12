package OOPS.finalkeyword;

public class CallbyvalueStudent {
    public static void main(String[] args) {
        Student student=new Student(1,"rohit");
        changMe(student);
        System.out.println(student.id+"\t"+student.name);
    }

    private static void changMe(Student student) {
        student=new Student(2,"nishant");
        System.out.println(student.id+"\t"+student.name);
    }
}
