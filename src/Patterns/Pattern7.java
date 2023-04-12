package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        /*
             *
            **
           ***
          ****
         *****
         */
        int numberofrows=5;
        for (int row = 1; row <=numberofrows ; row++) {
            //print space
            for (int space = numberofrows-row; space >0 ; space--) {
                System.out.print(" ");
            }
            //print stars
            for (int stars = 1; stars <=row ; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
