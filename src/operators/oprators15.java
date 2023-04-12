package operators;

public class oprators15 {
    public static void main(String[] args) {
        int a=1234;
        int first=a/1000;
                a=a%1000;
        int second=a/100;
                 a=a%100;
        int third=a/10;
                a=a%10;
        int fourth=a/1;
                 a=a%1;
        int sum=first+second+third+fourth;
        System.out.println("sum of four numbers="+sum);

    }
}
