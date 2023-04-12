package Multithreading.ThreadCreation;

public class RunnableWayToCreateThread2 {
    public static void main(String[] args) {
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i <=10 ; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    };
    Thread thread=new Thread(runnable);
        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
        thread.setName("worker");
        thread.start();
    }
}
