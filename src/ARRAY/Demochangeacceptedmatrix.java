package ARRAY;

import java.util.Scanner;

public class Demochangeacceptedmatrix {
    public static void main(String[] args) {
        int[][] matrix=acceptmatrix();
          int[][] transpose=transpose(matrix);
        printmatrix(transpose);

    }

    private static int[][] transpose(int[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int column = 0; column <row; column++) {
                int temp=matrix[row][column];
                matrix[row][column]=matrix[column][row];
                matrix[column][row]=temp;
            }
        }
        return matrix;
    }


    private static void printmatrix(int[][] matrix){
        System.out.println("****************printing the matrix");
        for (int row = 0; row < matrix.length ; row++) {
            for (int column = 0; column <matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }

    static int[][] acceptmatrix() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= scanner.nextInt();
        int columns=scanner.nextInt();
        int[][] matrix=new int[rows][columns];
        System.out.println("Enter the matrix");
        for (int row = 0; row <rows ; row++) {
            for (int column = 0; column <columns ; column++) {
                matrix[row][column]=scanner.nextInt();
            }
        }
        return matrix;
    }
}



