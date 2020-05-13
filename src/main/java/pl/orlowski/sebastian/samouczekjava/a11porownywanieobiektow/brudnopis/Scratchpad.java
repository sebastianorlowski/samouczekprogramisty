package pl.orlowski.sebastian.samouczekjava.a11porownywanieobiektow.brudnopis;

public class Scratchpad {

    public static void main(String[] args) {
        System.out.println("10 != 10: " + (10 !=10));
        System.out.println("10 = 10: " + (10 == 10));

        System.out.println("0.3 = 0.2 + 0.1: " + (0.3 == 0.1 + 0.2));
        System.out.println("0.3 = 0.2 + 0.1: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.00000001));

        String a1 = "something";
        String a2 = new String("something");
        String a3 = a2;
        String a4 = "something";
        System.out.println("a1 == a2" + (a1 == a2));
        System.out.println("a3 == a2" + (a3 == a2));
        System.out.println("a3 == a1" + (a3 == a1));
        System.out.println("a1 == a4" + (a1 == a4));

        System.out.println("test == test " +(new String("test") == new String("test")));
        System.out.println("test equals test " + (new String("test").equals(new String("test"))));


    }
}
