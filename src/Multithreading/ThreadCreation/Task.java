package Multithreading.ThreadCreation;

public class Task extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
