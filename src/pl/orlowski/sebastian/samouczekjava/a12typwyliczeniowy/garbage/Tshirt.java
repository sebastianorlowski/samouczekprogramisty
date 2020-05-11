package pl.orlowski.sebastian.samouczekjava.a12typwyliczeniowy.garbage;


public class Tshirt {
    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Adidas");
        System.out.println(tshirt.manufacturer + tshirt.size);

        switch (tshirt.size) {
            case S:
                System.out.println("To jest koszulka o rozmiarze S");
                System.out.println("Wymiar w klatce: " + tshirt.size.getChestWitdh());
                break;
            case M:
                System.out.println("To jest koszulka o rozmiarze M");
                break;
            case L:
                System.out.println("To jest koszulka o rozmiarze L");
                System.out.println("Wymiar w klatce " + tshirt.size.getChestWitdh());
                break;
            case XL:
                System.out.println("To jest koszulka o rozmiarze XL");
                break;
            case XXL:
                System.out.println("To jest koszulka o rozmiarze XXL");
                break;
        }
    }
}
