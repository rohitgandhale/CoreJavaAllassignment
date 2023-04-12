package Multithreading.ThreadDemo;

public class PlayEvenOdd {
    public static void main(String[] args) throws InterruptedException {
        Eventhread eventhread=new Eventhread();
        eventhread.setName("Eventhread ");
        OddThread oddThread=new OddThread();
        oddThread.setName("Oddthread ");
        eventhread.start();
        oddThread.start();
    }
}
