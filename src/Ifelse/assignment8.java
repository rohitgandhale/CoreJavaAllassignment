package Ifelse;
import java.util.Scanner;
public class assignment8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("no of classes");
        int classes=s.nextInt();
        System.out.println("no of classes attended");
        int attended=s.nextInt();
        int percentage=attended*100/classes;
        if (percentage>75){
            System.out.println("allowed");
        }else {
            System.out.println("not allowed");
        }
    }
}
