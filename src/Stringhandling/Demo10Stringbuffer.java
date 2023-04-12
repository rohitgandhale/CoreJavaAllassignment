package Stringhandling;

public class Demo10Stringbuffer {
    public static void main(String[] args) {
        String string="this is string object";
        StringBuffer stringBuffer=new StringBuffer("this is Stringbuffer object");
        StringBuilder stringBuilder=new StringBuilder("this is Stringbuilder object");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        //how to assign string object to stringbuffer and stringbuilder.
        StringBuffer stringBuffer1=new StringBuffer(string);
        StringBuilder stringBuilder1=new StringBuilder(string);
        System.out.println(stringBuffer1);
        System.out.println(stringBuilder1);
        String str1=new String(stringBuffer);
        String str2=new String(stringBuilder);
        System.out.println(str1);
        System.out.println(str2);
    }
}
