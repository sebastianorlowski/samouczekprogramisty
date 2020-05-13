package pl.orlowski.sebastian.samouczekjava.a09referencjasterta;

public class Main {
    public static void main(String[] args) {
        Object objectX = new Object();
        Object anotherObjectX = objectX;
        Object objectY = new Object();

        System.out.println("Object X: " + objectX);
        System.out.println("Object X1: " + anotherObjectX);
        System.out.println("Object Y: " + objectY);


    }

}
