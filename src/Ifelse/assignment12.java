package Ifelse;
import java.util.Scanner;
public class assignment12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter age");
        int age=s.nextInt();
        System.out.println("gender:('M'or'F')");
        char gender=s.next().charAt(0);
        System.out.println("marital status:('Y' or'N')");
        char  marital_status=s.next().charAt(0);
        if (gender=='F'){
            System.out.println("work only in urban area");
        } else if (gender=='M'&&(age>=20&&age<=40)) {
            System.out.println("can work everywhere");

        } else if (gender=='M'&&(age>=40&&age<=60)) {
            System.out.println("work in urban area");

        }else
            System.out.println("error");

    }
}
