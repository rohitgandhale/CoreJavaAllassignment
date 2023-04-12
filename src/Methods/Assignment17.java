package Methods;

public class Assignment17 {
    void Print(int a, char b){
        System.out.println("Integer is "+a+" Charactor is "+b);
    }
    void Pritnln(char b, int a){
        System.out.println("Charactor is "+b+" Integer is "+a);
    }

    public static void main(String[] args) {
        Assignment17 assignment17=new Assignment17();
        assignment17.Print(12,'R');
        assignment17.Pritnln('T',30);
    }
}
