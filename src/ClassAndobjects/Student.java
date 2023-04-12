package ClassAndobjects;

public class Student {
    public long phone_number;
    public String address;
    String name;
    int roll_num;
}
class Ans {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="john";
        student.roll_num=2;
        System.out.println("name is "+student.name+" and roll number is "+student.roll_num);
    }

}