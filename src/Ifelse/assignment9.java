package Ifelse;
import java.util.Scanner;
public class assignment9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("any medical cause:( 'Y or'N')");
        char medicalcause=s.next().charAt(0);
        if (medicalcause=='Y'){
            System.out.println("eligible");;
        }else {
            System.out.println("not eligible");;
        }

    }
}
