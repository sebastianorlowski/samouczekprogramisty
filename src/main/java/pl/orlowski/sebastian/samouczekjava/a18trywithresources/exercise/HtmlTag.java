package pl.orlowski.sebastian.samouczekjava.a18trywithresources.exercise;
// Teraz nadszedł czas na zadanie dla Ciebie. Strony w internecie tworzone są przy pomocy HTML, jest to język znaczników, który jest interpretowany przez przeglądarki internetowe wyświetlające strony www. Przykładem znaczników jest para <em>tekst</em>, jak widzisz jest tu znacznik otwierający <em> oraz zamykający </em> (akurat ta para odpowiedzialna jest za wyróżnianie tekstu). Wewnątrz znaczników znajduje się treść np. tekst. Istnieje wiele innych par znaczników np. <h1></h1>, <p></p>, <ul></ul> itd.,
//
//Zaimplementuj klasę HtmlTag, która będzie menadżerem kontekstu. W konstruktorze powinna przyjmować nazwę znacznika np. em. Klasa powinna mieć metodę body, która przyjmie parametr typu String i wypisze go na konsoli. Uruchamiając kod

public class HtmlTag implements AutoCloseable {
    private final String tagName;

    public HtmlTag(String tagName) {
        this.tagName = tagName;
        System.out.println("<" + tagName + ">");
    }

    public void body(String word) {
        System.out.println(word);
    }

    @Override
    public void close() {
        System.out.println("</" + tagName + ">");
    }
}
