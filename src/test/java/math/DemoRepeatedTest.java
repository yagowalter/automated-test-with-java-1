package math;

import br.com.yago.math.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @RepeatedTest(value = 3 , name = "{displayName}. Repetition" +
            " {currentRepetition} of {totalRepetitions}!")
    @DisplayName("Test Division By zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo,
            TestInfo testInfo
    ) {

        System.out.println("Repetition nº " + repetitionInfo.getCurrentRepetition()
                + " of " + repetitionInfo.getTotalRepetitions());

        System.out.println("Running " + testInfo.getTestMethod().get().getName());
        //given
        double firstNumber = 6.2D;
        double secondNumber = 0D;

        var expectedMessage = "Impossible to divide by zero!";

        //When & then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            //When & then
            math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
    }
}
