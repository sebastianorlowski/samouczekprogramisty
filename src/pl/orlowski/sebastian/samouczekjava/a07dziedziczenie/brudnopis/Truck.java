package pl.orlowski.sebastian.samouczekjava.a07dziedziczenie.brudnopis;

public class Truck {
    private final int fuel;
    private final int capacity = 120;

    public Truck(int fuel) {
        this.fuel = fuel;
    }

    public void fillTruck() {
        int toFill = capacity - fuel;
        fillTruck(toFill);
    }

    public void fillTruck(int toFill) {
        if(toFill > 50) {
            System.out.println("You need a lot of fuel");
        }
        else {
            System.out.println("You need a little fuel");
        }
    }




}
