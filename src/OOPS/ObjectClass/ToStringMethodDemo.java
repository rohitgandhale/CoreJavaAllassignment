package OOPS.ObjectClass;

public class ToStringMethodDemo {
    public static void main(String[] args) {
        int number=10;
        System.out.println("Binary "+Integer.toBinaryString(number));
        System.out.println("Octal "+Integer.toOctalString(number));
        System.out.println("HexadecimaL "+Integer.toHexString(number));

        ToStringMethodDemo ref=new ToStringMethodDemo();
        int hashcode=ref.hashCode();
        System.out.println("Decimal Hashcode "+hashcode);
        System.out.println("Hexadecimal Hashcode "+Integer.toHexString(hashcode));
        System.out.println(ref.toString());//this print adderess of class and hexadecimal hashcode of it.
    }
}
