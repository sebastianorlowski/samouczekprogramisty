package pl.orlowski.sebastian.samouczekjava.a14modyfikatorydostepu.scratchpad;

public class BallPen extends Pen {
    protected String manufacturer;

    public static void main(String[] args) {
        BallPen ballPen = new BallPen("Red", 2011, "Bic");
        ballPen.readPen();
    }
    public BallPen(String color,int yearOfProduction, String manufacturer) {
        super(color, yearOfProduction);
        this.manufacturer = manufacturer;
    }



    @Override
    public String toString() {
        return "BallPen{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
