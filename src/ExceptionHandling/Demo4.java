package ExceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        Integer integer=Integer.valueOf("abc");//NumberFormatException
        System.out.println(integer);
        String str="abc";
        System.out.println(str.charAt(3));// StringindexOutOfBoundsException

    }
}
