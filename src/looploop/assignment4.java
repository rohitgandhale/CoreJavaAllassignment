package looploop;

public class assignment4 {
    public static void main(String[] args) {
   int n=4;
        for (int row = n; row >=1 ; row--) {
            for (int column = 1; column <=n-row ; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <=2*row-1 ; column++) {
                if (column%2 != 0) {
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
