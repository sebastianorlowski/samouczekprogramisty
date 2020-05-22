package pl.orlowski.sebastian.samouczekjava.a20klasywewnetrzne;

public class OuterClass2 {
    public static class InnerClass {

    }
    private InnerClass instantie() {
        return new InnerClass();
    }

    private static void staticInnerClass() {
        OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass();
    }


}

