package pl.orlowski.sebastian.samouczekjava.a11PorownywanieObiektow.exercise;

import sun.print.PeekGraphics;

import java.util.Objects;

//Na koniec krótkie zadanie dla Ciebie. Napisz klasę reprezentującą człowieka, zaimplementuj metody hashCode i equals. Zastanów się czy to, że ktoś ma to samo imię i nazwisko sprawia, że jest to ta sama osoba? Jaki atrybut może posłużyć do sprawdzenia czy dwie instancje klasy Human reprezentują tę samą osobę?
public class Human {
    private String name;
    private String lastName;
    private long PESEL;

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Human(String name, String lastName, long PESEL) {
        this.name = name;
        this.lastName = name;
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return PESEL == human.PESEL &&
                Objects.equals(name, human.name) &&
                Objects.equals(lastName, human.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, PESEL);
    }

    public static void main(String[] args) {
        Human human1 = new Human("Sebastian", "Orlowski", 95081900075L);
        Human human2 = new Human("Alicja", "Pawlowska");
        Human human3 = new Human("Pawel", "Orlowski");
        Human human4 = new Human("Sebastian", "Orlowski", 93081900076L);

        System.out.println("human1 = human2 " + (human1.equals(human2)));
        System.out.println("human2 = human3 " + (human2.equals(human3)));
        System.out.println("human3 = human4 " + (human3.equals(human4)));
        System.out.println("human 4 = human1 " + (human4.equals(human1)));

        System.out.println("human 1 hashcode" + human1.hashCode());
        System.out.println("human 3 hashcode" + human3.hashCode());
        System.out.println("human 4 hashcode" + human4.hashCode());
    }
}

