package pro.sky.skyprospringtestcalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.sky.skyprospringtestcalculator.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({
            "5,5,10",
            "-5,5,0"
    })

    public void testPlus(float num1, float num2, float expected) {
        assertEquals(expected, calculatorServiceImpl.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "20,10,10",
            "-30,30,-60"
    })

    public void testMinus(float num1, float num2, float expected) {
        assertEquals(expected, calculatorServiceImpl.minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "10,3,30",
            "-10,4,-40"
    })

    public void testMultiply(float num1, float num2, float expected) {
        assertEquals(expected, calculatorServiceImpl.multiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "100,10,10",
            "-50,2,-25"
    })

    public void testDivide(float num1, float num2, float expected) {
        assertEquals(expected, calculatorServiceImpl.divide(num1, num2));
    }
}
