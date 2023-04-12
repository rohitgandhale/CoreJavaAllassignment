package looploop;
public class assignment13 {
    public static void main(String[] args) {
        for (int i = 100; i <=500 ; i++) {
            int sum=0;
            int t=i;
            while (t!=0){
            sum=sum+((t%10)*(t%10)*(t%10));
             t=t/10;
            }if (sum==i){
                System.out.println(i);
            }
        }
    }

}
