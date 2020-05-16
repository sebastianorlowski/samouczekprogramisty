package pl.orlowski.sebastian.samouczekjava.a17typygeneryczne.example;

public class FruitBox {
    private Object fruit;

    public FruitBox(Object fruit) {
        this.fruit = fruit;
    }

    public Object getFruit() {
        return fruit;
    }

    public static void main(String[] args) {
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();
        Apple fruit2 = (Apple) fruitBox.getFruit();

    }
}
