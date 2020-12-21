import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    public static final int FIZZ_VLALUE = 3;
    public static final int BUZZ_VLALUE = 5;
    public static final int FIZZ_BUZZ_VLALUE = 15;
    @Test
    @DisplayName("case 9")
    void getFizzBuzzCase9() {
        int number=9;
        String expected="Fizz";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 25")
    void getFizzBuzzCase25() {
        int number=25;
        String expected="Buzz";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 15")
    void getFizzBuzzCase15() {
        int number=15;
        String expected="FizzBuzz";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 11")
    void getFizzBuzzCase11() {
        int number=11;
        String expected="11";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case -15")
    void getFizzBuzzCaseNagative15() {
        int number=-15;
        String expected="invalid value";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 13")
    void getFizzBuzzCaseNagative13() {
        int number=13;
        String expected="Fizz";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 58")
    void getFizzBuzzCaseNagative58() {
        int number=58;
        String expected="Buzz";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 77")
    void getFizzBuzzCaseNagative77() {
        int number=77;
        String expected="seventy seven";
        String result=FizzBuzz.getFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("case 12")
    void isHasFIZZ_VLALUEcase12() {
        int number=12;
        boolean expected=false;
        boolean result=FizzBuzz.isHasFIZZ_VLALUE(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("case 13")
    void isHasFIZZ_VLALUEcase13() {
        int number=13;
        boolean expected=true;
        boolean result=FizzBuzz.isHasFIZZ_VLALUE(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("case 26")
    void isHasBUZZ_VLALUE26() {
        int number=26;
        boolean expected=false;
        boolean result=FizzBuzz.isHasBUZZ_VLALUE(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 51")
    void isHasBUZZ_VLALUE51() {
        int number=51;
        boolean expected=true;
        boolean result=FizzBuzz.isHasBUZZ_VLALUE(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 6")
    void convertNumberToStringCase6() {
        int number=6;
        String expected="six";
        String result=FizzBuzz.convertNumberToString(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 18")
    void convertNumberToStringCase18() {
        int number=18;
        String expected="eighteen";
        String result=FizzBuzz.convertNumberToString(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 20")
    void convertNumberToStringCase25() {
        int number=20;
        String expected="twenty";
        String result=FizzBuzz.convertNumberToString(number);
        assertEquals(expected,result);
    }
}