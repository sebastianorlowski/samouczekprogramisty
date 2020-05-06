package pl.orlowski.sebastian.samouczekjava.obiekty.dog;

public class Bulldog {
    String name;
    boolean isBig;
    int lengthOfLife;

    public Bulldog(String name, boolean isBig, int lengthOfLife) {
        this.name = name;
        this.isBig = isBig;
        this.lengthOfLife = lengthOfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    public int getLengthOfLife() {
        return lengthOfLife;
    }

    public void setLengthOfLife(int lengthOfLife) {
        this.lengthOfLife = lengthOfLife;
    }

    @Override
    public String toString() {
        return "Bulldog{" +
                "name='" + name + '\'' +
                ", isBig=" + isBig +
                ", lengthOfLife=" + lengthOfLife +
                '}';
    }
}
