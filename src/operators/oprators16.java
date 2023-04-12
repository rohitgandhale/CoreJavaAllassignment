package operators;

public class oprators16 {
    public static void main(String[] args) {
        int a,first,second,third,fourth,reverse;
        a=1234;
        first=a/1000;
            a=a%1000;
        second=a/100;
             a=a%100;
         third=a/10;
             a=a%10;
        fourth =a/1;
              a=a%1;
         reverse=fourth*1000+third*100+second*10+first*1;
        System.out.println("reverse="+reverse);
    }
}
