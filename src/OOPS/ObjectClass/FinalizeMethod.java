package OOPS.ObjectClass;

public class FinalizeMethod {
    public static void main(String[] args) {
      course course1=new course(1,"java");
      course course2=new course(2,"advance java");
      course1=null;
      System.gc();
    }
}
