package pl.orlowski.sebastian.samouczekjava.a06interfejsy.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new ComputationMultiply(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new ComputationAdd(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner input = new Scanner(System.in);
        System.out.println("Czy chcesz mnożyć czy dodawać? TAK jeśli chcesz mnożyć / NIE jeżeli dodawać");
        String multiply = input.nextLine();
        // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
        return multiply.equalsIgnoreCase("tak");
    }

    private double getArgument() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        return input.nextInt(); // tutaj pobierz liczbę od użytkownika
    }
}