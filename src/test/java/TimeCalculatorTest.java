import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TimeCalculatorTest {

    @Test
    public void testCalculateTimeValidInputs() {
        assertEquals(2.0, TimeCalculator.calculateTime(100, 50), 0.0001);
        assertEquals(1.5, TimeCalculator.calculateTime(150, 100), 0.0001);
    }

    @Test
    public void testCalculateTimeWithZeroSpeed() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                TimeCalculator.calculateTime(100, 0)
        );
        assertEquals("Distance and speed must be greater than zero.", exception.getMessage());
    }

    @Test
    public void testCalculateTimeWithZeroDistance() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                TimeCalculator.calculateTime(0, 50)
        );
        assertEquals("Distance and speed must be greater than zero.", exception.getMessage());
    }

    @Test
    public void testCalculateTimeWithNegativeValues() {
        assertThrows(IllegalArgumentException.class, () -> TimeCalculator.calculateTime(-10, 50));
        assertThrows(IllegalArgumentException.class, () -> TimeCalculator.calculateTime(100, -5));
    }
}
