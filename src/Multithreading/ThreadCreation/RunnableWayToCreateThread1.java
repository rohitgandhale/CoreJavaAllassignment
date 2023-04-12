package Multithreading.ThreadCreation;

public class RunnableWayToCreateThread1 {
    public static void main(String[] args) {
      Worker worker=new Worker();
      Thread thread=new Thread(worker);
      thread.start();
      thread.setName("worker");


        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}
