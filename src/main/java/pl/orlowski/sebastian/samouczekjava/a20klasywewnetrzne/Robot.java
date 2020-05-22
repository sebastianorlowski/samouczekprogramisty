package pl.orlowski.sebastian.samouczekjava.a20klasywewnetrzne;

public class Robot {
    private AnonymousClass anonymousClass;

    public Robot(AnonymousClass anonymousClass) {
        this.anonymousClass = anonymousClass;
    }

    public void welcome() {
        anonymousClass.sayHello();
    }

    public static void main(String[] args) {
        Robot sebastian = new Robot(new AnonymousClass() {
            @Override
            public void sayHello() {
                System.out.println("Cześć");
            }
        });

        Robot alicja = new Robot(new AnonymousClass() {
            @Override
            public void sayHello() {
                System.out.println("Hej");
            }
        });

        alicja.welcome();
        sebastian.welcome();
    }

}
