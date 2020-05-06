package pl.orlowski.sebastian.samouczekjava.a04PetleInstrukcje;

public class Cwiczenia {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        System.out.println(exercise5(7, 11, 1, 2, 1));

    }

    // Poza poznanym dzisiaj operatorem ++ istnieje też jego odpowiednik zmniejszający wartość zmiennej o 1. Jest nim --. Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.

    public static void exercise1() {
        for(int i = 20; i>10; i--) {
            System.out.print(i + " ");
        }
    }

    // Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.

    public static void exercise2() {
        int number = 10;
        System.out.println();
        while (number <= 20) {
            System.out.print(number + " ");
            number++;
        }
    }

    // Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.

    public static void exercise3() {
        System.out.println();
        for(int i=-10;i<40;i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    // Przerób pętlę z zadania trzeciego na pętlę while.

    public static void exercise4() {
        System.out.println();
        int i = -10;
        while(i<40) {
            i++;
            if(i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    // Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.

    public static int exercise5(int ... tab) {
        System.out.println();
        int sum = 0;
        for(int i : tab) {
            sum += i;
            }
        return sum;
    }

        }
