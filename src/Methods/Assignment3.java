package Methods;

import java.util.Scanner;

public class Assignment3 {
    static int Eligibletovote(int Ageofperson){
        if (Ageofperson >18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not Eligible to vote");
        }
        return Ageofperson;
    }

    public static void main(String[] args) {
        Assignment3 assignment3=new Assignment3();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter age");
        int Ageofperson=s.nextInt();
        Eligibletovote(Ageofperson);
    }
}
