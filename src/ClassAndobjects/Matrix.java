package ClassAndobjects;

public class Matrix {
    int No_oRrows;
    int No_ofColumns;

    public Matrix(int i, int j) {
        this.No_oRrows=i;
        this.No_ofColumns=j;

    }

    public static void main(String[] args) {
        Matrix matrix=new Matrix(1,2);
        System.out.println("No of rows="+matrix.No_oRrows);
        System.out.println("No of columns="+matrix.No_ofColumns);
    }
}
