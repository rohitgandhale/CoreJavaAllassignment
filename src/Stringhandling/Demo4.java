package Stringhandling;

public class Demo4 {
    public static void main(String[] args) {
        String message="i am rohit eknath gandhale";
        message=message.toUpperCase();
        System.out.println(message);
        String source="cyber success";
        source=source.replace("cyber","Student");
        System.out.println(source);
        String spaces="        spaces             ";
        spaces=spaces.trim();
        System.out.println(spaces.toUpperCase());


    }
}
