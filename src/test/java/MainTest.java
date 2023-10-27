import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testZeroInput() {
        double actual = Main.calculateTax(0);
        double expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testUpperBoundOFZeroPercentTaxBracket() {
        double actual = Main.calculateTax(14999);
        double expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testLowerBoundOfTenPercentTaxBracket() {
        double actual = Main.calculateTax(15000);
        double expected = 0.1;
        assertEquals(expected, actual);
    }

    @Test
    public void testUpperBoundOfTenPercentTaxBracket() {
        double actual = Main.calculateTax(19999);
        double expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void testLowerBoundOfFifteenPercentTaxBracket() {
        double actual = Main.calculateTax(20000);
        double expected = 500.15;
        assertEquals(expected, actual);
    }

    @Test
    public void testUpperBoundOfFifteenPercentTaxBracket() {
        double actual = Main.calculateTax(29999);
        double expected = 2000;
        assertEquals(expected, actual);
    }

    @Test
    public void testLowerBoundOfTwentyPercentTaxBracket() {
        double actual = Main.calculateTax(30000);
        double expected = 2000.2;
        assertEquals(expected, actual);
    }

    @Test
    public void testUpperBoundOfTwentyPercentTaxBracket() {
        double actual = Main.calculateTax(44999);
        double expected = 5000;
        assertEquals(expected, actual);
    }

    @Test
    public void testLowerBoundOfTwentyFivePercentTaxBracket() {
        double actual = Main.calculateTax(45000);
        double expected = 5000.25;
        assertEquals(expected, actual);
    }

    @Test
    public void testAllTaxBrackets() {
        double actual = Main.calculateTax(50000);
        double expected = 6250.25;
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> Main.calculateTax(-50000));
        assertTrue(thrown.getMessage().contains("Salary cannot be negative"));
    }

}