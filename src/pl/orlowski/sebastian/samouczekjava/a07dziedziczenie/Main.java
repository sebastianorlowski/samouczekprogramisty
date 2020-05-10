package pl.orlowski.sebastian.samouczekjava.a07dziedziczenie;

import pl.orlowski.sebastian.samouczekjava.a07dziedziczenie.brudnopis.Truck;

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
