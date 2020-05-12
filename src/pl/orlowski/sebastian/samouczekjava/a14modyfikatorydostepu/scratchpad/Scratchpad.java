package pl.orlowski.sebastian.samouczekjava.a14modyfikatorydostepu.scratchpad;

public class Scratchpad {
    private Pen pen;
    public Scratchpad(Pen pen) {
        this.pen = pen;

    }

    public static void main(String[] args) {
        BallPen ballPen = new BallPen("Red", 2014, "Bic");
        System.out.println(ballPen.toString());
        ballPen.readPen();
        Scratchpad scratchpad = new Scratchpad(ballPen);
    }

}
