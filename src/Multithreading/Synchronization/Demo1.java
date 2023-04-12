package Multithreading.Synchronization;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Thread thread1=new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                counter.incrementcount();
            }

        },"thread1 ");
        Thread thread2=new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                counter.incrementcount();
            }

        },"thread2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Total count "+Counter.count);
    }
}
