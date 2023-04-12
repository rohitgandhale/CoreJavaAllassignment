package Multithreading.Synchronization;

public class Demo4 {
    public static void main(String[] args) {
        Product product=new Product();
        Thread producer=new Thread(()->{
            while (true) {
               product.produce();
            }
        },"producer ");
        Thread consumr=new Thread(()->{
            while (true){
                product.consume();
            }


        },"Consumer");
        producer.start();
        consumr.start();

    }
}
