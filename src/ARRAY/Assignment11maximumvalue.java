package ARRAY;

public class Assignment11maximumvalue {
    public static void main(String[] args) {
        int[] array = {10, 23, 34000, 34, 4511};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("maximum value is "+max);
    }

}
