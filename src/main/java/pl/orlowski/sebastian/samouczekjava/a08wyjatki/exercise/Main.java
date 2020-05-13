package pl.orlowski.sebastian.samouczekjava.a08wyjatki.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

//  Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException. Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        Main main = new Main();
        double number = 0;
        try {
            number = input.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Podaj odpowiednią liczbę");
            number = input.nextDouble();
        }
        if(number < 0) {
            throw new IllegalArgumentException("Liczba nie może być mniejsza niż 0");
        }
        else {
            System.out.println(main.pierwiastek(number));
        }

    }

    public double pierwiastek(double number) {
        number = Math.sqrt(number);
        return number;
    }
}
