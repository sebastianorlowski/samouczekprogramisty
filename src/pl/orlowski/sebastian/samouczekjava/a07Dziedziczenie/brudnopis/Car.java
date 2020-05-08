package pl.orlowski.sebastian.samouczekjava.a07Dziedziczenie.brudnopis;

public class Car extends Vehicle {

    public Car(Engine engine, int numberOfWheels) {
        super(engine, numberOfWheels);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Fasten seatbelt");
    }



}
