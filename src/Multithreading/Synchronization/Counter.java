package Multithreading.Synchronization;

public class Counter {
    static int count=0;
    public void incrementcount(){
        synchronized (this){
            count++;
        }
        System.out.println(Thread.currentThread().getName()+" "+count);
    }
}
