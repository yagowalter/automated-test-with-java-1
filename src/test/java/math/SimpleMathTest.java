package math;

import br.com.yago.math.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operations in SimpleMath Class")
public class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum() {

        System.out.println("Test 6.2 + 2 = 8.2");
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {

        System.out.println("Test 6.2 - 2 = 4.2");

        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual, () -> firstNumber + " - " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test SquareRoot of 81 = 9")
    void testSquareRoot() {

        System.out.println("Test SquareRoot of 81 = 9");

        double firstNumber = 81D;
        Double actual = math.squareRoot(firstNumber);
        double expected = 9;

        assertEquals(expected, actual, 0.01D, () -> "SquareRoot of " + firstNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication() {

        System.out.println("Test 6.2 * 2 = 12.4");
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    void testMean() {

        System.out.println("Test (6.2 + 2) / 2 = 4.1");
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual, () -> "The mean of " + firstNumber + " and " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {

        System.out.println("Test 6.2 / 2 = 3.1");


        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @DisplayName("Test BDD")
    @Test
    void test_When__Should() {

        System.out.println("Test BDD");
    }
}
