package OOPS.Polymorphism;

public class Demo {
   final int add(int a,int b){
    return a+b;
}
  public String add(String a, String b){
    return a+b;
}
  private int add(float num1,float num2){
    return (int) (num1+num2);
}
   protected int add(int num1,int num2, int num3){
    return num1+num2+num3;
}

    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.add(10,20));
        System.out.println(d.add("Rohit","Gandhale"));
        System.out.println(d.add(10.5f,20.5f));
        System.out.println(d.add(10,20,30));
    }
}
