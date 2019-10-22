package ar.edu.unvqui.eis;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorSubtractionCaseTest{
    private static Calculator calc = new Calculator();

    @Test
    public void shouldSubtractBothNumber()
    {
        assertEquals(4, calc.subtract(8,4));
    }

    @Test
    public void shouldSubtractBothNumberWithMemory(){
        assertEquals(4, calc.subtract(8,4));
        assertEquals(4, calc.memory());
    }


}
