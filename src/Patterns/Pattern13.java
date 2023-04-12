package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        /*
         5 5 5 5 5
          4 4 4 4
           3 3 3
            2 2
             1
         */
        for (int row = 1; row <=5 ; row++) {
            for (int space = 0; space <row ; space++) {
                System.out.print(" ");
            }
            for (int number = 5; number >=row ; number--) {
                System.out.print(6-row+" ");
            }
            System.out.println();
        }
    }
}
