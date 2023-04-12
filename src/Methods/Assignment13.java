package Methods;

public class Assignment13 {
    public static boolean isperfect(int number){
        boolean isPerfect=true;
        int sum=0;
        for (int i = 1; i <=number/2 ; i++) {
            if (number%i==0){
                sum+=i;
            }
        }
        if (sum!=number){
            isPerfect=false;
        }
        return isPerfect;
        }

    public static void main(String[] args) {

        System.out.println("Perfect Number in this range are");
        for (int number = 1; number <=1000 ; number++) {
            if (isperfect(number)){
                System.out.println(" "+ number);
            }
        }
    }





}
