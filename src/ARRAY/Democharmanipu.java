package ARRAY;

public class Democharmanipu {
    public static void main(String[] args) {
        char[] chars={'c','y','b','e','r'};
        System.out.println(isEmpty(chars));
        System.out.println(size(chars));
        char[] uppercase=toUppercase(chars);
        System.out.println("uppercase array");
        for (int i = 0; i < uppercase.length; i++) {
            System.out.println(uppercase[i]+" ");
        }

    }

    private static char[] toUppercase(char[] chars) {
        if (chars==null || chars.length==0){
            return new char[]{};
        }
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i]>='a'|| chars[i]<='A'){
                chars[i]-=32;
            }
        }
        return chars;
    }
    private static boolean isEmpty(char[] chars){
        return chars ==null || chars.length ==0;
    }
    private static int size(char[] chars){
        if (chars==null || chars.length==0){
            return 0;
        }
        return chars.length;
    }
}
