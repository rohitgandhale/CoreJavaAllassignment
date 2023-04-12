package Multithreading.ThreadCreation;

public class RunnableWayToCreateLambda6 {
    public static void main(String[] args) {
        Runnable runnable=()->
                System.out.println("lambda working "+Thread.currentThread().getName());
      //  Thread thread=new Thread(runnable,"lambda");
        Thread thread=new Thread(()->
                System.out.println("lambda working "+Thread.currentThread().getName()),"lambda");
        thread.start();

    }
}
