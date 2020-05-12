package pl.orlowski.sebastian.samouczekjava.a13adnotacje.scratchpad;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scratchpad {
    public Scratchpad() {

    }
    public boolean equal(Object obj) {
        return true;
    }

    // Przy błędzie jak w metodzie wyżej, wyrzuca nam błąd, że nie przysłaniamy metody, ponieważ nie ma equal, jest equals
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    //Adnotacja do może być użyta tylko do atrybutu, ponieważ przypisaliśmy do niej ElementType.FIELD
    @Target(ElementType.FIELD)
    public @interface fieldAnnotation {
        String id();
    }


    public static void main(String[] args) {
        String a = "something";
        String b = "something";
        String c = new String("lelelele");
        System.out.println(a.equals(b));
        Product product = new Product("Table Mars", "IKEA", 2019);

        List listOfUndefinedObjects = new ArrayList();
        listOfUndefinedObjects.add("something");
        listOfUndefinedObjects.add(b);
        listOfUndefinedObjects.add(32322);
        listOfUndefinedObjects.add(c);
        listOfUndefinedObjects.add(product);

        List<Integer> listInteger = (List<Integer>) listOfUndefinedObjects;

        System.out.println(listInteger.get(3));
    }

}
