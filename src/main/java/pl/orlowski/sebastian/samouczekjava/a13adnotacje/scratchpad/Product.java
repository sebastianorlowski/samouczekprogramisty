package pl.orlowski.sebastian.samouczekjava.a13adnotacje.scratchpad;

public class Product {
    String name;
    String manufacturer;
    int yearOfProduction;

    public Product(String name, String manufacturer, int yearOfProduction) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
