package CalculatorTest;

import ClassATester.addition.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    void addShouldReturnTheSumOfTwoNumbers(){
        //Arange
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        //Act
        int result = calculator.add(a,b);

        //Assert
        // Class equivalence 1 : all numbers are positive
        assertEquals(11, calculator.add(10,1));
        assertEquals(50, calculator.add(48,2));
        assertEquals(11, calculator.add(5,6));
        assertEquals(16, calculator.add(9,7));
        assertEquals(10, calculator.add(2,8));
        assertEquals(12, calculator.add(7,5));

    }

}
