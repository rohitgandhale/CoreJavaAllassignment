package Multithreading.ThreadCreation;

public class RunnableWayToCreateLambda7 {
    public static void main(String[] args) {
        new Thread(()->
        {
            for (int i = 0; i <10 ; i++) {
                System.out.println("lambda is working "+Thread.currentThread().getName()+"Rohit");
            }
        },"Gandhale ").start();

    }
}
