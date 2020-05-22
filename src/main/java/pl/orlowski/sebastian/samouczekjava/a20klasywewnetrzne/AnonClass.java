package pl.orlowski.sebastian.samouczekjava.a20klasywewnetrzne;

public class AnonClass implements AnonymousClass {

    @Override
    public void sayHello() {
        System.out.println("Hey");
    }

    public void methodExample() {
        AnonymousClass anonymousClass = new AnonymousClass() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
    }
}
