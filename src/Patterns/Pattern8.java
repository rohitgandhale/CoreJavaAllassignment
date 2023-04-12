package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        /*
         1
        12
       123
      1234
     12345
         */
        int numberofrows=5;
        for (int row = 1; row <=numberofrows ; row++) {
            for (int space = numberofrows-row; space >0 ; space--) {
                System.out.print(" ");
            }
            for (int number = 1; number <=row ; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
