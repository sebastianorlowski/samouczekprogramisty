package pl.orlowski.sebastian.samouczekjava.a13adnotacje.exercise;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Na koniec mam dla Ciebie zadanie. Napisz adnotację @MyDocumentation, która będzie miała elementy author oraz comment. Informacja o tej adnotacji powinna być dostępna w trakcie uruchomienia programu.

public class ExerciseOne {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD})
    public @interface MyDocumentation {
        String author() default "Sebastian";
        String comment();
    }

    public static void main(String[] args) {
    }

}
