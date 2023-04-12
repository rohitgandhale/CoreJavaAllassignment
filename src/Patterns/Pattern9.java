package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        /*
         1
        22
       333
      4444
     55555
         */
        int numberofrows=5;
        for (int row = 1; row <=numberofrows ; row++) {
            for (int spaces = numberofrows-row; spaces >0 ; spaces--) {
                System.out.print(" ");
            }
            for (int number = 1; number <=row ; number++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
