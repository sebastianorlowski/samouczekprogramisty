package pl.orlowski.sebastian.samouczekjava.a11PorownywanieObiektow.brudnopis;

import java.util.Objects;

public class Chair {
    private String manufacturer;
    private int yearOfProduction;
    private String model;

    public Chair(String manufacturer, int yearOfProduction, String model) {
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Chair) {
            Chair otherChair = (Chair) o;
            return model.equals(otherChair.model) && manufacturer.equals(otherChair.manufacturer) && yearOfProduction ==otherChair.yearOfProduction;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 * model.hashCode() + 31 * manufacturer.hashCode() + 7 * yearOfProduction;
    }

    public static void main(String[] args) {
        Chair chair1 = new Chair("IKEA", 2020, "Martini");
        Chair chair2 = new Chair("IKEA", 2020, "Martini");
        Chair chair3 = new Chair("IKEA", 2019, "Martini");
        Chair chair4 = new Chair("IKEA", 2020, "Fort William");
        System.out.println(chair1.hashCode());
        System.out.println(chair2.hashCode());
        System.out.println(chair4.hashCode());
        System.out.println(chair1.hashCode());
        System.out.println("chair 1 equals chair 2 " + chair1.equals(chair2));
        System.out.println("chair 2 equals chair 3 " + chair2.equals(chair3));
        System.out.println("chair 3 equals chair 4 " + chair3.equals(chair4));
        System.out.println("chair 4 equals chair 1 " + chair4.equals(chair1));
        System.out.println("char 1 equals null " + chair1.equals(null));
    }
}
