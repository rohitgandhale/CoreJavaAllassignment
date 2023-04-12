package OOPS.finalkeyword;

public  class Parent {
   final int a=100;
   final   void m1(){
        System.out.println("parent m1");
    }

    public static void main(String[] args) {
        Parent parent=new Parent();
        System.out.println(parent.a);
    }
}
