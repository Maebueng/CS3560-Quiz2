import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 5;
        int actual = calculator.sum(2,3);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.subtract(2, 3);
        assertEquals(expected, actual);
    }
}
