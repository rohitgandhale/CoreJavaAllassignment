package Ifelse;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter product quantity");
        int quantity= s.nextInt();
        System.out.println("enter the product price");
        int productprice=s.nextInt();
        int billamount=productprice*quantity;
        float finalbillamount=0;
        if (billamount>1000){
            finalbillamount=(float) (billamount-(billamount*0.1));
            System.out.println("discount="+finalbillamount);}
            else {
            System.out.println("final bill amount="+billamount);
            }


    }
}
