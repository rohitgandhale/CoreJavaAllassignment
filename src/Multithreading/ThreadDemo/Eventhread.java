package Multithreading.ThreadDemo;

public class Eventhread extends Thread{
    @Override
    public void run() {
        for (int i=1; i <=1000 ; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
