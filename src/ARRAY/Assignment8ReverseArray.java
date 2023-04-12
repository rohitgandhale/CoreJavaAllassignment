package ARRAY;

public class Assignment8ReverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        for (int left = 0,right= array.length-1; left <right ; left++,right--) {
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

