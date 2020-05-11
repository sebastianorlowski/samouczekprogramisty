package pl.orlowski.sebastian.samouczekjava.a12typwyliczeniowy.exercisetwo;
// Napisz typ wyliczeniowy Computation, który będzie reprezentował prosty kalkulator. Niech typ ten posiada następujące wartości MULTIPY, DIVIDE, ADD, SUBTRACT. Niech typ ten posiada metodę public double perform(double x, double y), która zwróci wynik odpowiedniej operacji. Na przykład Computation.ADD.perform(1, -5) powinno zwrócić -4.
public enum Computation {

    MULTIPLY {
        public double perform(double x, double y) {
            return x * y;
        }
    },

    DIVIDE {
        public double perform(double x, double y) {
            return x / y;
        }
    },

    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },

    SUBTRACT {
        public double perform(double x, double y) {
            return x - y;
        }
    };

    public abstract double perform(double x, double y);

}
