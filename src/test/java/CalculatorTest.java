import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTwoNumbers(){
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void subtractTwoNumbers(){
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    public void multiplyTwoNumbers(){
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void divideTwoNumbers(){
        assertEquals(5, calculator.divide(10, 2));
    }

}
