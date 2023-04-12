package OOPS.Lambda;

import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        Stringprocessor stringprocessor = new StringProcessorImpl();
        System.out.println(stringprocessor.process("traditional way"));
        Stringprocessor anon = new Stringprocessor() {
            @Override
            public String process(String string) {
                return string.toUpperCase();
            }
        };
        System.out.println(anon.process("anonymous class"));

        Stringprocessor lambda = (string) -> string.toUpperCase();
        System.out.println(lambda.process("lambda expressions"));
    }
}
