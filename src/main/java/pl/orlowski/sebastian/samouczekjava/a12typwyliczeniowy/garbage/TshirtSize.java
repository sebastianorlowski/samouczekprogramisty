package pl.orlowski.sebastian.samouczekjava.a12typwyliczeniowy.garbage;

public enum TshirtSize {
    S(70, 80, 50),M(75, 85, 55),L(80,90,60),
    XL(85, 95, 65),XXL(90,95, 65);

    private final int chestWitdh;
    private final int shirtLength;
    private final int sleeveLength;

    TshirtSize(int chestWitdh, int shirtLength, int sleeveLength) {
        this.chestWitdh = chestWitdh;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWitdh() {
        return chestWitdh;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }
}
