package Ifelse;
import java.util.Scanner;
public class assignment13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter four numbers");
        int n=s.nextInt();
      int  first =n/1000;
           n=n%1000;
      int second=n/100;
            n=n%100;
      int third=n/10;
             n=n%10;
      int fourth=n/1;
              n=n%1;
      int reverse=fourth*1000+third*100+second*10+first*1;
        System.out.println("reverse="+reverse);

    }
}
