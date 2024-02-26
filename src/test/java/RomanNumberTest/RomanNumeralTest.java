package RomanNumberTest;

import ClassATester.nombreRoman.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    @Test
    public void convertShouldReturnArabicNumerals(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XX");

        Assertions.assertEquals(20, result);
    }
}
