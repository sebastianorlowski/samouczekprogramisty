package pl.orlowski.sebastian.samouczekjava.a17typygeneryczne.boxy;

public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    Pair<BoxOnSteroids<Apple>, BoxOnSteroids<Strawberry>> pairOfBoxes =
            new Pair<>(
                    new BoxOnSteroids<Apple>(new Apple()),
                    new BoxOnSteroids<Strawberry>(new Strawberry())
            );

}
