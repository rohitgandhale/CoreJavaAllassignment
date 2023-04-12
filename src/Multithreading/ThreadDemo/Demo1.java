package Multithreading.ThreadDemo;

public class Demo1 {
    public static void main(String[] args) {
        // we are just creating object and not actual thread creation
        Task task=new Task();
        task.setName("Task");
        task.start();
        System.out.println("rest of the main");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
