package pl.orlowski.sebastian.samouczekjava.a10KonwersjaRzutowanie.exercise;

import java.util.Scanner;

// Napisz program przyjmujący od użytkownika liczbę całkowitą i wyświetl wynik mnożenia tej liczby oraz stałej pi (Math.PI). Wyświetl wynik w postaci liczby całkowitej i liczby zmiennoprzecinkowej.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        Exercise1 exerciseOne = new Exercise1();
        int number = input.nextInt();
        exerciseOne.multiplyByInt(number);
        exerciseOne.multiplyByFloat(number);
    }
    public Exercise1() {
    }

    public void multiplyByInt(int number) {
        System.out.println(number * (int) Math.PI);
    }

    public void multiplyByFloat(int number) {
        System.out.println(number * (float) Math.PI);
    }
}
