package pl.orlowski.sebastian.samouczekjava.a01obiekty.dog;

public class GoldenRetriever extends Bulldog {
    String name;
    boolean isBig;
    int lenghtOfLife;

    public GoldenRetriever(String name, boolean isBig, int lengthOfLife) {
        super(name, isBig, lengthOfLife);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isBig() {
        return isBig;
    }

    @Override
    public void setBig(boolean big) {
        isBig = big;
    }

    public int getLenghtOfLife() {
        return lenghtOfLife;
    }

    public void setLenghtOfLife(int lenghtOfLife) {
        this.lenghtOfLife = lenghtOfLife;
    }

    @Override
    public String toString() {
        return "GoldenRetriever{" +
                "name='" + name + '\'' +
                ", isBig=" + isBig +
                ", lenghtOfLife=" + lenghtOfLife +
                '}';
    }
}
