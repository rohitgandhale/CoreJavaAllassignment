package Stringhandling;

public class DemoStringbuilderMethod {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("hello");
        stringBuilder.append(10);
        stringBuilder.append(true);
        stringBuilder.append('A');
        stringBuilder.append(10.5f);
        stringBuilder.insert(0,"beginning");
        stringBuilder.insert(11,"between");
        stringBuilder.delete(0,10);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        StringBuilder stringBuilder1=new StringBuilder("welcome aaaaaa hello bbbbbb welcome aaaaaa");
        System.out.println(stringBuilder1.indexOf("o"));
        stringBuilder1.replace(0,20,"Rohit");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder1.capacity());

        StringBuilder stringBuilder2=new StringBuilder(100);
        System.out.println("length "+stringBuilder2.length());
        System.out.println("capacity "+stringBuilder2.capacity());

    }
}
