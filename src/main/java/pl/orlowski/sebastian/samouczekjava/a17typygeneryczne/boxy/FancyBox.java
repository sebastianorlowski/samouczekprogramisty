package pl.orlowski.sebastian.samouczekjava.a17typygeneryczne.boxy;

public class FancyBox<T> extends StandardBox<T> {

    public FancyBox(T object) {
        super(object);
    }

    public void saySomething() {
        System.out.println("Something " + object);
    }

    private static void method1(FancyBox<?> box) {
        Object object = box.object;
        System.out.println(object);
    }

    public static void main(String[] args) {
        FancyBox<String> fancyBox = new FancyBox<>("new");
        fancyBox.saySomething();

        method1(new FancyBox<>(new Object()));
        method1(new FancyBox<>(new Apple()));
        method1(new FancyBox<>(new Strawberry()));

    }
}
