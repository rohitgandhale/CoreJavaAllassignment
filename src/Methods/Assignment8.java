package Methods;

import java.util.Scanner;

public class Assignment8 {

    public static char calculategrade(int marks){
        char grade=0;
        if (marks<40){
           grade= 'g';
        } else if (marks>=41 && marks<=50) {
            grade='f';
        } else if (marks>=51 && marks<=60) {
            grade='e';
        } else if (marks>=61 && marks<=70) {
            grade='d';
        } else if (marks>=71 && marks<=80) {
            grade='c';
        } else if (marks>=81 && marks<=90) {
            grade='b';
        }else if (marks>=91 && marks<=100){
            grade='a';
        }return grade;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=s.nextInt();
        char grade=calculategrade(marks);
        System.out.println("Grade is "+grade);
    }

}
