package ARRAY;

public class Assignment5DeletetheElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int ElementToBeDeleted = 10;
        int IndexOfElementToBeDeleted = 0;
        for (int i = 0; i < array.length; i++) {
            if (ElementToBeDeleted==array[i]){
                IndexOfElementToBeDeleted=array[i];
                break;
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
