package Multithreading.ThreadRevision;

public class Demo {
    public static void main(String[] args) {
        Runnable runnable=() ->
            System.out.println("this is run method implementation with lambda");
        Student student=new Student(runnable);
        student.start();
    }
}
