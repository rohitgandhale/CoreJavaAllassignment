package OOPS.Lambda;

import java.util.Locale;

public class StringProcessorImpl implements Stringprocessor{
    @Override
    public String process(String string) {
        return string.toUpperCase();
    }
}
