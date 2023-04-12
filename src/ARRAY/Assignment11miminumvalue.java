package ARRAY;

public class Assignment11miminumvalue {
    public static void main(String[] args) {
        int[] array = {10, 20, 103, 414, 880};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("minimum valus is "+min);
    }

}
