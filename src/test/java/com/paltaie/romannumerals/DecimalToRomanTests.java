package com.paltaie.romannumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecimalToRomanTests {

    RomanNumeralService romanNumeralService = new RomanNumeralServiceImpl();

    @Test
    public void shouldConvert3toIII() {
        assertEquals("III", romanNumeralService.decimalToRoman(3));
    }

    @Test
    public void shouldConvertIVto4() {
        assertEquals("IV", romanNumeralService.decimalToRoman(4));
    }

    @Test
    public void shouldConvertIXto9() {
        assertEquals("IX", romanNumeralService.decimalToRoman(9));
    }

    @Test
    public void shouldConvertLVIIIto58() {
        assertEquals("LVIII", romanNumeralService.decimalToRoman(58));
    }

    @Test
    public void shouldConvertMCMLXXXVIIto1987() {
        assertEquals("MCMLXXXVII", romanNumeralService.decimalToRoman(1987));
    }

    @Test
    public void shouldConvertMMDCCCLXXXVIIIto2888() {
        assertEquals("MMDCCCLXXXVIII", romanNumeralService.decimalToRoman(2888));
    }
}