package ARRAY;

public class Assignment3LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 9, 10, 14, 15,};
       int search=3;
       boolean ispresent=false;
        for (int index = 0; index <array.length ; index++) {
            if (search==array[index]){
                ispresent=true;
                break;
            }
        }
        System.out.println(ispresent?"its present ":"its not present ");
    }

}


