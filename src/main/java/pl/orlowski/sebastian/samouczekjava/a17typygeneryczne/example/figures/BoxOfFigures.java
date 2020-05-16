package pl.orlowski.sebastian.samouczekjava.a17typygeneryczne.example.figures;

public class BoxOfFigures<T extends Figure> {
    private T element;

    public BoxOfFigures(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementName() {
        return element.getName();
    }

}
