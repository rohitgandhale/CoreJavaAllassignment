package Multithreading.ThreadCreation;

public class RunnableWayToCreateThread3 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <50 ; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        },"rohit");
        thread.start();
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }

    }
