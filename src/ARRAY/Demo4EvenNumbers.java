package ARRAY;

public class Demo4EvenNumbers {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,8,10,12,14,20};
        for (int index = 0; index < array.length ; index++) {
            if (array[index]%2==0){
                System.out.println(array[index]);
            }
        }
    }
}
