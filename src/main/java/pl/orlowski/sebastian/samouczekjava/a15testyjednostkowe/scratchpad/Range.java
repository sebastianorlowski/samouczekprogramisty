package pl.orlowski.sebastian.samouczekjava.a15testyjednostkowe.scratchpad;

public class Range {
    private int lowerBound;
    private int upperBound;

    public Range(int lowerBound, int upperBound) {
        if(lowerBound > upperBound) {
            throw new IllegalArgumentException("Lower bound shouldnt be bigger than upper bound");
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean isRange(int number) {
        return lowerBound <= number && upperBound >= number;
    }
}
