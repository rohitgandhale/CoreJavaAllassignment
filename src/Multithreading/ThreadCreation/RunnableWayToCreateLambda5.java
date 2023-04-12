package Multithreading.ThreadCreation;

import ClassAndobjects.Rectangle1;

public class RunnableWayToCreateLambda5 {
    public static void main(String[] args) {
        //way 1: to implement Runnable   Runnable refrenceoftyperunnable=new Work();
     /* way 2:  Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("working anonymous thread "+Thread.currentThread().getName());
            }
        };*/
           //way 3:using lambda
     Runnable runnable=()->{
         System.out.println("working thread "+Thread.currentThread().getName());};
     Thread thread=new Thread(runnable);
     thread.start();
     thread.setName("worker");

    }
}
class work implements Runnable{

    @Override
    public void run() {
        System.out.println("working "+Thread.currentThread().getName());
    }
}

