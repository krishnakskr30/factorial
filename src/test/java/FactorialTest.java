import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnHundredAndTwentyIfTheNumberIsFive() {
        int number = 5;
        int expectedResult = 120;
        Factorial factorial = new Factorial(number);

        int actualResult = factorial.calculateFactorial();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnOneIfTheNumberIsZero() {
        int number = 0;
        int expectedResult = 1;
        Factorial factorial = new Factorial(number);

        int actualResult = factorial.calculateFactorial();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnOneIfTheNumberIsOne() {
        int number = 1;
        int expectedResult = 1;
        Factorial factorial = new Factorial(number);

        int actualResult = factorial.calculateFactorial();

        assertEquals(expectedResult, actualResult);
    }
}
