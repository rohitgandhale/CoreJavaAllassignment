package Ifelse;
import java.util.Scanner;
public class assignment6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("age of 3 persons");
        int person1 = s.nextInt();
        int person2 = s.nextInt();
        int person3 = s.nextInt();
        int oldest = 0;
        int youngest = 0;
        if (person1 > person2 && person1 > person3) {
            oldest = person1;
        } else if (person2 > person1 && person2 > person3) {
            oldest = person2;

        } else ;
        {
            oldest = person3;
        }if (person1<person2&&person1<person3){
            youngest=person1;
        } else if (person2<person1&&person2<person3) {
            youngest=person2;
        }else {
            youngest=person3;
        }
        System.out.println("oldest"+oldest);
        System.out.println("youngest"+youngest);


    }

}

