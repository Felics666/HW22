package pro.sky.skyprospringtestcalculator;

import org.junit.jupiter.api.Test;
import pro.sky.skyprospringtestcalculator.exception.DivideByZeroException;
import pro.sky.skyprospringtestcalculator.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {

    final private CalculatorServiceImpl calculatorServiceimpl = new CalculatorServiceImpl();

    @Test
    public void testPlus() {
        assertEquals(10, calculatorServiceimpl.plus(5.0f, 5.0f));
        assertEquals(0, calculatorServiceimpl.plus(-5.0f, 5.0f));
    }

    @Test
    public void testMinus() {
        assertEquals(20, calculatorServiceimpl.minus(30.0f, 10.0f));
        assertEquals(5, calculatorServiceimpl.minus(25.0f, 20.0f));
    }

    @Test
    public void testMultiply() {
        assertEquals(35, calculatorServiceimpl.multiply(7.0f, 5.0f));
        assertEquals(100, calculatorServiceimpl.multiply(10.0f, 10.0f));
    }


    @Test
    public void testDivide() {
        assertEquals(35, calculatorServiceimpl.divide(350.0f, 10.0f));
        assertEquals(100, calculatorServiceimpl.divide(1000.0f, 10.0f));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(DivideByZeroException.class, () -> calculatorServiceimpl.divide(5.0f, 0.0f));
    }

}
