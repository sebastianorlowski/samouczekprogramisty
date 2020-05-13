package pl.orlowski.sebastian.samouczekjava.a15testyjednostkowe.scratchpad;

import static org.junit.Assert.*;

import org.junit.*;

public class RangeTest {
    private Range range;


    @Before
    public void setUp() {
        range = new Range(10,20);
    }

    @Test
    public void shouldSay15IsInRange() {
        assertTrue(range.isRange(15));
    }

    @Test
    public void shouldSay22IsNotInRange() {
        assertFalse(range.isRange(22));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfWrongNumber() {
        new Range(15,10);
    }
}
