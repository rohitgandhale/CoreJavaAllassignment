package ClassAndobjects;

public class student1 {
    int roll_num;
    String name;
    float phone_number;
    String address;

    public static void main(String[] args) {
        Student student=new Student();
        student. roll_num=1;
        student.name="john";
        student.phone_number= 957970407;
        student.address="ahmednagar";
        Student student1=new Student();
        student1.roll_num=2;
        student1.name="nishant";
        student1.phone_number=866988481;
        System.out.println(student.name+"\t"+student.roll_num+"\t"+student.phone_number+"\t"+student.address);
        System.out.println(student1.name+"\t"+student1.roll_num+"\t"+student1.phone_number+"\t"+student1.address);

    }
}









