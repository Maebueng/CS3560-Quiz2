import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
        // Case 1: Positive minus negative
        assertEquals(8, calculator.subtract(5, -3));

        // Case 2: Negative minus negative
        assertEquals(-2, calculator.subtract(-5,-3));
    }

    @Test
    public void testMultiply() {
        // Case 1: Multiply 0
        assertEquals(0, calculator.multiply(0, 1));

        // Case 2: Multiply negative number
        assertEquals(-1, calculator.multiply(1, -1));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6,3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6, 0);
        });
    }

    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(calculator.isEven(4));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(calculator.isEven(5));
    }
}
