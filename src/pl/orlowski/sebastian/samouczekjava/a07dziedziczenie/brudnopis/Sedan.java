package pl.orlowski.sebastian.samouczekjava.a07dziedziczenie.brudnopis;

public class Sedan extends Vehicle {
    private static final int WHEELS = 4;


    public Sedan(Engine engine) {
        super(engine, WHEELS);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Wrrrm");
    }
}
