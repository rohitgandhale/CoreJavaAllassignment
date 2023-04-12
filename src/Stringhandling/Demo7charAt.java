package Stringhandling;

public class Demo7charAt {
    public static void main(String[] args) {
        String str1="this is the demo for charAt";
        char[] charArray=str1.toCharArray();
        for (int index = 0; index < charArray.length ; index++) {
            System.out.print(charArray[index]+" ");
        }
        String str2=new String(charArray);
    }
}
