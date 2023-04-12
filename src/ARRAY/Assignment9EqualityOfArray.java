package ARRAY;

public class Assignment9EqualityOfArray {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {10,20, 30,40};
        System.out.println("Arrays are equal " + equalarray(array1, array2));
    }

    private static boolean equalarray(int[] array1, int[] array2) {
        if (array1==null || array2==null){
            return false;
        }
        if (array1.length != array2.length){
            return false;
        }
        for (int index = 0; index < array1.length ; index++) {
            if (array1[index]!=array2[index]){
                return false;
            }
        }
        return true;
    }
    }
