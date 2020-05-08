package pl.orlowski.sebastian.samouczekjava.a07Dziedziczenie.brudnopis;

public class Vehicle {
    protected Engine engine;
    protected int numberOfWheels;

    public Vehicle(Engine engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
    }
    public void startEngine() {
        System.out.println("Brrrrm brrrrrm");
    }

    public void something() {
        System.out.println("Something");
    }
}
