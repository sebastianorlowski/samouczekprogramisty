package pl.orlowski.sebastian.samouczekjava.a12typwyliczeniowy.exercisetwo;

import java.util.Scanner;

public class Main {
    private double x;
    private double y;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = 0;
        double y = 0;
        System.out.print("First Number: ");
        x = input.nextDouble();
        System.out.println("Second Number: ");
        y = input.nextDouble();
        System.out.println(Computation.ADD.perform(x,y));
        System.out.println(Computation.MULTIPLY.perform(x,y));
    }

}
