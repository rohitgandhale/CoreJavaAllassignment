package ExceptionHandling;

public class Demo21 {
    public static void main(String[] args) {
        Demo20 demo20=new Demo20();
        Demo21 demo21=new Demo21();
        demo21.equals(demo20);
        // Class cast exception is occurs when JVM is
        // unable to cast object of one type to another type
    }

    @Override
    public boolean equals(Object obj) {
        Demo21 demo21=(Demo21) obj;
        return this.equals(demo21);
    }
}
