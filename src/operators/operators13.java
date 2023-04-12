package operators;
public class operators13 {
    public static void main(String[] args) {
      int  a=34557;
        int first = a/10000;
                 a=a%10000;
        int second=a/1000;
                a=a%1000;
        int third=a/100;
                a=a%100;
        int fourth=a/10;
                 a=a%10;
        int fifth=a/1;
                a=a%1;
                int sum=first+fourth;
        System.out.println("sum of 1st and 4th number="+sum);




    }
}
