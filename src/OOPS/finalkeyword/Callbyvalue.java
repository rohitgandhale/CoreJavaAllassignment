package OOPS.finalkeyword;

public class Callbyvalue {
    private static int add(int num1,int num2){
        num1=100;
        num2=200;

        return num1+num2;
    }

    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        System.out.println(add(num1,num2));
        System.out.println(num1);
        System.out.println(num2);
    }
}
