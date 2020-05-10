package pl.orlowski.sebastian.samouczekjava.a09referencjasterta.brudnopis;

public class Main {
    public static void main(String[] args) {
        ChangeAttributes attribute1 = new ChangeAttributes(123);
        ChangeAttributes attribute2 = attribute1;

        System.out.println(attribute1.getAttribute());
        System.out.println(attribute2.getAttribute());

        attribute1.setAttribute(20);

        System.out.println(attribute1.getAttribute());
        System.out.println(attribute2.getAttribute());

        attribute2.setAttribute(120);

        System.out.println(attribute1.getAttribute());
        System.out.println(attribute2.getAttribute());

        System.out.println(attribute1);
        System.out.println(attribute2);

        String a1 = new String("a");
        String a2 = new String ("a");
        String a3 = "a";
        String a4 = "a";

    }

}
