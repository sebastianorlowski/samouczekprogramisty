package pl.orlowski.sebastian.samouczekjava.a18trywithresources.exercise;

public class Main {
    public static void main(String[] args) {
        try (HtmlTag h1 = new HtmlTag("h1");
             HtmlTag em = new HtmlTag("em")) {
            em.body("something");
        }
    }
}
