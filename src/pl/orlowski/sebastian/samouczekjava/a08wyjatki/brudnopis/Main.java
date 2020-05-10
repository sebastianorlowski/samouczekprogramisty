package pl.orlowski.sebastian.samouczekjava.a08wyjatki.brudnopis;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.example();
    }

    public int getNumbersOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour cannot be less than 0");
        }
        return hour * 60 * 60;
    }

    public void example() {
        int hours = -3;
        int numberOfSeconds = 0;
        try {
            numberOfSeconds = getNumbersOfSeconds(hours);
        }
        catch (IllegalArgumentException e) {
            numberOfSeconds = getNumbersOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
        }

}
