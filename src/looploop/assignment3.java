package looploop;
public class assignment3 {
    public static void main(String[] args) {
        int n=3;
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n- row; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <=2* row -1 ; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = n; row >=1 ; row--) {
            for (int column = 1; column <=n- row; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <=2 * row -1 ; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
