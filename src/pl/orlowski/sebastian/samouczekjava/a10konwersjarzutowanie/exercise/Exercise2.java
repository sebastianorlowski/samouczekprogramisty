package pl.orlowski.sebastian.samouczekjava.a10konwersjarzutowanie.exercise;

import java.util.Scanner;

// //Napisz program pobierający od użytkownika dwie liczby całkowite. Wyświetl wynik ich dzielenia wraz z częścią ułamkową.
public class Exercise2 {
    public Exercise2() {
    }

    public void twoResults(int n1, int n2) {
        float result = (float) n1 / n2;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        Exercise2 exercise = new Exercise2();
        exercise.twoResults(n1, n2);

    }
}
