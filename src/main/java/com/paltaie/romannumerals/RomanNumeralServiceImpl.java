package com.paltaie.romannumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralServiceImpl implements RomanNumeralService {

    private static final Map<Character, Integer> ROMAN_TO_DECIMAL = new HashMap<>();

    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};
    private static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D",
            "DC", "DCC", "DCCC", "CM"};
    private static final String[] TENS = {"", "X", "XX", "XXX", "XL", "L",
            "LX", "LXX", "LXXX", "XC"};
    private static final String[] ONES = {"", "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX"};

    static {
        ROMAN_TO_DECIMAL.put('I', 1);
        ROMAN_TO_DECIMAL.put('V', 5);
        ROMAN_TO_DECIMAL.put('X', 10);
        ROMAN_TO_DECIMAL.put('L', 50);
        ROMAN_TO_DECIMAL.put('C', 100);
        ROMAN_TO_DECIMAL.put('D', 500);
        ROMAN_TO_DECIMAL.put('M', 1000);
    }

    public int romanToDecimal(String roman) {
        int cursor = 0;
        int total = 0;

        while (cursor < roman.length()) {
            int thisValue = ROMAN_TO_DECIMAL.get(roman.charAt(cursor));
            if (roman.length() > (cursor + 1)) {
                int nextValue = ROMAN_TO_DECIMAL.get(roman.charAt(cursor + 1));
                if (nextValue > thisValue) {
                    total += nextValue - thisValue;
                    cursor += 2;
                } else {
                    total += thisValue;
                    cursor++;
                }
            } else {
                total += ROMAN_TO_DECIMAL.get(roman.charAt(cursor));
                cursor++;
            }
        }

        return total;
    }

    @Override
    public String decimalToRoman(int decimal) {
        String thousands = THOUSANDS[decimal/1000];
        String hundereds = HUNDREDS[(decimal%1000)/100];
        String tens = TENS[(decimal%100)/10];
        String ones = ONES[decimal%10];

        return thousands + hundereds + tens + ones;
    }
}
