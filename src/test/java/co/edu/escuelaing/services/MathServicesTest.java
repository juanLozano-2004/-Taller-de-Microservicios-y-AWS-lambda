package co.edu.escuelaing.services;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathServicesTest {

    @Test
    public void shouldSquarePositiveNumber() {
        assertEquals(Integer.valueOf(25), MathServices.square(5));
    }

    @Test
    public void shouldSquareNegativeNumber() {
        assertEquals(Integer.valueOf(196), MathServices.square(-14));
    }

    @Test
    public void shouldSquareZero() {
        assertEquals(Integer.valueOf(0), MathServices.square(0));
    }
}