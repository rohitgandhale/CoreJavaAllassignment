package ARRAY;

public class Assignment6Copy {
    public static void main(String[] args) {
      int [] array={10,20,30,40,50};
      int [] copy=new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            copy[i]=array[i];
        }
        for (int i = 0; i < copy.length ; i++) {
            System.out.println(copy[i]);
        }
    }
}
