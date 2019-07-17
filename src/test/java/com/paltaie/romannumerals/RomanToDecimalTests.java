package com.paltaie.romannumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToDecimalTests {

    RomanNumeralService romanNumeralService = new RomanNumeralServiceImpl();

    @Test
    public void shouldConvertIIIto3() {
        assertEquals(3, romanNumeralService.romanToDecimal("III"));
    }

    @Test
    public void shouldConvertIVto4() {
        assertEquals(4, romanNumeralService.romanToDecimal("IV"));
    }

    @Test
    public void shouldConvertIXto9() {
        assertEquals(9, romanNumeralService.romanToDecimal("IX"));
    }

    @Test
    public void shouldConvertLVIIIto58() {
        assertEquals(58, romanNumeralService.romanToDecimal("LVIII"));
    }

    @Test
    public void shouldConvertMCMLXXXVIIto1987() {
        assertEquals(1987, romanNumeralService.romanToDecimal("MCMLXXXVII"));
    }

    @Test
    public void shouldConvertMMDCCCLXXXVIIIto2888() {
        assertEquals(2888, romanNumeralService.romanToDecimal("MMDCCCLXXXVIII"));
    }
}