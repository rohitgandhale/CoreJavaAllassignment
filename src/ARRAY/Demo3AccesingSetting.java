package ARRAY;

public class Demo3AccesingSetting {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        array[2]=100;
        array[3]=200;
        array[4]=300;
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }
    }
}
