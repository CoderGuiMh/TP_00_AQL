package Exercice_5Test;

import ClassATester.Exercice_5_Factorial.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FactorialTest {
    @Test
    void testFactorialWithPositiveNumber(){
        int n = 5;
        int result = Factorial.factorial(n);
        assertEquals(120, result);
    }
    @Test
    void testFactorialWithZero(){
        int n = 0;
        int result  = Factorial.factorial(n);
        assertEquals(1, result);
    }
    @Test
    void testFactorialWithNegativeNumber(){
        int n = -3;
        assertThrows(IllegalArgumentException.class, ()->{
            Factorial.factorial(n);
        });
    }
}
