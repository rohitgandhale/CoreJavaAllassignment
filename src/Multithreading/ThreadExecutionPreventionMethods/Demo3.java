package Multithreading.ThreadExecutionPreventionMethods;

public class Demo3 {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->
        {
            for (int i = 0; i <100 ; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        },"thread1 ");
        thread1.setPriority(10);
        Thread thread2=new Thread(()->
        {
            for (int i = 0; i <100 ; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        },"thread2 ");
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
        //yield means giveup
        //yield method will give up the execution of currently executing thread
        //to other threads which have same or more priority
        //main thread give suggestion to thread schedular
        //that main thread is ready to giveup the execution
        // for other threads which have same priority
        // it is upto schedular to takeup this or not
        Thread.yield();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }


    }
}
