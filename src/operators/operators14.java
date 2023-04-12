package operators;

public class operators14 {
    public static void main(String[] args) {
        int a,first,second,third,fourth,fifth,sum;
        a=12345;
        first=(a/10000)+2;
             a=a%10000;
        second=(a/1000)+2;
            a=a%1000;
        third=(a/100)+2;
            a=a%100;
        fourth=(a/10)+2;
            a=a%10;
        fifth=(a/1)+2;
             a=a%1;
    sum=first*10000+second*1000+third*100+fourth*10+fifth*1;
        System.out.println("sum of all 5 numbers+2="+sum);


    }
}
