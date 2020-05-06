/* Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.
Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.
Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących do przechowywania sudoku i uzupełnij ją przykładową planszą.
Jak przechowałbyś stan gry w szachy? Napisz program, który stworzy instancje tablic służące do przechowywania stanu gry w szachy. Potrafiłbyś zachować w nim ostatni stan partii Kasparowa z Deep Blue?

 */


package pl.orlowski.sebastian.samouczekjava.a03Tablice;

public class Cwiczenie {

    public static void main(String[] args) {
        System.out.println(tablica());
        System.out.println(tablica2());
    }

    // Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.
    public static int tablica() {
        int[] tab = new int[2];
        tab[0] = 9;
        tab[1] = 12;
        int sum = tab[0] + tab[1];
        return sum;
    }

    // Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.
    public static int tablica2() {
        int[] tab = new int[3];
        tab[0] = 11;
        tab[1] = 12;
        tab[2] = 4;
        int highest;
        if(tab[0] > tab[1] && tab[0] > tab[2]) {
            highest = tab[0];
        }
        else if(tab[1] > tab[0] && tab[1] > tab[2]) {
            highest = tab[1];
        }
        else {
            highest = tab[2];
        }
        return highest;
    }


}
