package Methods;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter salary");
        int grossSalary=s.nextInt();
        System.out.println("Enter net savings");
        int savings=s.nextInt();
        int tax= calculateTax(grossSalary,savings);
        System.out.println("tax="+tax);
    }
    public static int calculateTax(int grossSalary,int savings) {
        int netTaxableAmount = grossSalary - savings;
        int tax = 0;

        int slab1 = 0;
        int slab2 = (int) (slab1+netTaxableAmount*0.1);
        int slab3 = (int) (slab1+slab2+netTaxableAmount*0.2);
        int  slab4=(int) (slab1+slab2+slab3+netTaxableAmount * 0.3);
        if (netTaxableAmount <=100000) {
            slab1 = 0;
            tax = slab1;
        } else if (netTaxableAmount > 100000 && netTaxableAmount <= 200000) {
            tax=slab2;
        } else if (netTaxableAmount > 200000 && netTaxableAmount <= 500000) {
            tax=slab3;
        } else if (netTaxableAmount > 500000) {
            tax = slab4;
        }
        return tax;
    }

}
