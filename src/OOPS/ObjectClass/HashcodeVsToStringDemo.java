package OOPS.ObjectClass;

public class HashcodeVsToStringDemo {
    public static void main(String[] args) {
        HashcodeVsToStringDemo course=new HashcodeVsToStringDemo();
        //hashcode returns integer value which is not direct memory address.
        //It is just number which represents that actual memory address.
        System.out.println(Integer.toHexString(course.hashCode()));
        System.out.println(course.toString());
    }
}
