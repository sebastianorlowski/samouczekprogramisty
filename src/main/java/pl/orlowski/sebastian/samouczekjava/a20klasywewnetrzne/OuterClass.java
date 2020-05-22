package pl.orlowski.sebastian.samouczekjava.a20klasywewnetrzne;

public class OuterClass {
    public class InnerClass {

        public void something() {
            System.out.println("Something");
        }
    }


    private static void example() {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }

    public void method() {
        AnonymousClass anonymousClass = () -> System.out.println("Hello");
    }
    }





