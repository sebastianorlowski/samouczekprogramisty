package pl.orlowski.sebastian.samouczekjava.a07Dziedziczenie;

import pl.orlowski.sebastian.samouczekjava.a07Dziedziczenie.brudnopis.Car;
import pl.orlowski.sebastian.samouczekjava.a07Dziedziczenie.brudnopis.Sedan;
import pl.orlowski.sebastian.samouczekjava.a07Dziedziczenie.brudnopis.Truck;
import pl.orlowski.sebastian.samouczekjava.a07Dziedziczenie.brudnopis.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much fuel do you have?");
        int fuel = input.nextInt();
        Truck truck = new Truck(fuel);
        truck.fillTruck();
    }
}
