package CollectionFramework;

import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Collection framework :
        //java.util package
    Iterable iterable=()->
            new Iterator() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Object next() {
                    return null;
                }
            };
    }

}
