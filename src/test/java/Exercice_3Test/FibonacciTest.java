package Exercice_3Test;

import ClassATester.Exercice_3_Fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class FibonacciTest {
    @Test
    void testWithPositiveNumber(){
        int n      = 10;
        int result = Fibonacci.fibonacci(n);
        assertEquals(55, result);
    }
    @Test
    void testWithZero(){
        int n = 0;
        int result = Fibonacci.fibonacci(n);
        assertEquals(0, result);
    }
    @Test
    void testWithOne(){
        int n = 1;
        int result = Fibonacci.fibonacci(n);
        assertEquals(1, result);
    }
    @Test
    void testWithNegativeNumber(){
        int n = -10;
        assertThrows(IllegalArgumentException.class, ()->{
            Fibonacci.fibonacci(n);
        });
    }
}
