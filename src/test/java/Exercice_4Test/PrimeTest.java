package Exercice_4Test;

import ClassATester.Exercice_4_PrimeNumber.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class PrimeTest {
    @Test
    void testIsPrimeWithPrimeNumber(){
        int primeNumber = 17;
        boolean result  = Prime.isPrime(primeNumber);
        assertTrue(result);
    }
    @Test
    void testIsPrimeWithNonPrimeNumber(){
        int nonPrimeNubmer = 20;
        boolean result     = Prime.isPrime(nonPrimeNubmer);
        assertFalse(result);
    }
    @Test
    void testIsPrimeWithNegativeNumber(){
        int negativeNumber  = -5;
        boolean result     = Prime.isPrime(negativeNumber);
        assertFalse(result);
    }
    @Test
    void testIsPrimeWithZero(){
        int zero       = 0;
        boolean result = Prime.isPrime(zero);
        assertFalse(result);
    }
    @Test
    void testIsPrimeWithOne(){
        int one = 1;
        boolean result = Prime.isPrime(one);
        assertFalse(result);
    }
}

