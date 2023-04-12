package Stringhandling;

public class Assignment2 {
    public static void main(String[] args) {
        String string="rohit eknath gandhale";
        int count=1;
        for (int i = 0; i <string.length()-1 ; i++) {
            if ((string.charAt(i)==' ') && (string.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("number of words "+ count);
    }
}
