package looploop;

import com.sun.source.tree.BreakTree;

public class assignment26 {
    public static void main(String[] args) {
        System.out.println("perfect number in this range are");
        for (int number = 1; number <=1000; number++) {
            if (isPerfect(number)){
                System.out.print(" "+number);
            }
        }
    }

    public static boolean isPerfect(int number){
        boolean isPerfect=true;
        int sum=0;
        for (int i = 1; i <=number /2; i++) {
            if (number%i==0){
                sum+=i;
            }
        }
        if (sum!=number){
        isPerfect=false;
    }
    return isPerfect;
}
}
