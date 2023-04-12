package Multithreading.ThreadCreation;

public class Runnableway {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <50 ; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        };
        Thread thread=new Thread(runnable);
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
        thread.start();
        thread.setName("worker");

    }

}
