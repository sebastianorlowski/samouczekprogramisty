package pl.orlowski.sebastian.samouczekjava.a14modyfikatorydostepu.scratchpad;

public class Pen {
    protected String color;
    protected int yearOfProduction;

    public Pen(String color, int yearOfProduction) {
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    protected final void readPen() {
        System.out.println("Ja piszę kolorowo");
    }
}
