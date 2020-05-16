package pl.orlowski.sebastian.samouczekjava.a17typygeneryczne.example;

public class BoxOnSteroids<T> {
    public T fruit;

    public BoxOnSteroids(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }


    public static void main(String[] args) {
        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<Apple>(new Apple());
        BoxOnSteroids<Strawberry> strawberryBox = new BoxOnSteroids<Strawberry>(new Strawberry());

        Strawberry strawberry = strawberryBox.getFruit();
        Apple apple = appleBox.getFruit();

    }
}
