package pl.orlowski.sebastian.samouczekjava.a16testjednostkowejunit5;

import java.math.BigDecimal;

public class Kilogram implements WeightUnit {
    public final BigDecimal value;

    public Kilogram(BigDecimal value) {
        if(BigDecimal.ZERO.compareTo(value) > 0) {
            throw new IllegalArgumentException ("Weight cannot be less than zero!");
        }
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }

    public Pound toPounds() {
        return new Pound(value.divide(Pound.POUND_TO_KILOGRAM_RATIO, SCALE, ROUNDING_MODE));
    }
}
