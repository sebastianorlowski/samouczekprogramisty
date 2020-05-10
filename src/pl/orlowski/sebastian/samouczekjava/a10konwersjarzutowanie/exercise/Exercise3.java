package pl.orlowski.sebastian.samouczekjava.a10konwersjarzutowanie.exercise;
// Napisz program, który skończy się wyjątkiem spowodowanym błędem podczas boxingu/unboxingu.
public class Exercise3 {
    public Exercise3() {

    }

    public static void main(String[] args) {

        double primitiveDouble = Double.valueOf(null);
        System.out.println(primitiveDouble);
    }
}
