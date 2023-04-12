package Methods;

import java.util.Scanner;

public class Assignment4 {
  public static void Addition(){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter 1st number");
      int a=s.nextInt();
      System.out.println("Enter 2nd number");
      int b=s.nextInt();
      System.out.println("Sum="+(a+b));
  }

    public static void main(String[] args) {
        Addition();
    }

}
