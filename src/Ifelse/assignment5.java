package Ifelse;
import java.util.Scanner;
public class assignment5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("marks");
        int marks = s.nextInt();
        char grade = 0;
        if (marks < 25) {
            grade = 'F';
        } else if (marks >= 25 && marks < 45) {
            grade = 'E';
        } else if (marks >= 45 && marks < 50) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'c';
        } else if (marks >= 60 && marks < 80) {
            grade = 'B';
        } else if (marks >= 80) {
            grade = 'A';
        }
        System.out.println("your marks ="+marks + " grade " + grade);
    }
}
