package com.paltaie.romannumerals;

public class RomanNumeralServiceImpl implements RomanNumeralService {

    public enum RomanNumeral{
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        private int value;

        RomanNumeral(int value){
            this.value = value;
        }

        public int getIntegerValue() {
            return value;
        }
    }

    public int romanToDecimal(String roman) {
        int result = 0;
        while(roman.length() > 0){
            for(RomanNumeral romanNumeral : RomanNumeral.values()){
                if(roman.startsWith(romanNumeral.name())){
                    if(roman.length() > romanNumeral.name().length()){
                        if(RomanNumeral.valueOf(Character.toString(roman.charAt(romanNumeral.name().length()))).getIntegerValue() <=
                                romanNumeral.getIntegerValue()){
                            roman = roman.replaceFirst(romanNumeral.name(), "");
                            result += romanNumeral.getIntegerValue();
                        }
                    } else {
                        roman = roman.replaceFirst(romanNumeral.name(), "");
                        result += romanNumeral.getIntegerValue();
                    }
                }
                if(roman.length() == 0){
                    return result;
                }
            }
        }

        return result;
    }

    @Override
    public String decimalToRoman(int decimal) {
        //Initialise a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        //Loop through the roman numerals in order, starting with the largest.
        for(RomanNumeral romanNumeral : RomanNumeral.values()){

            //Check given numeral is larger than the roman numeral
            while(decimal >= romanNumeral.getIntegerValue()){

                //Update the result
                result.append(romanNumeral);

                //Reduce the given value
                decimal -= romanNumeral.getIntegerValue();
            }
        }
        //Finally return the result
        return result.toString();
    }
}
