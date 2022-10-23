package string;

/**
 * Given a roman string, change it to a decimal number
 */

public class RomanToDecimal {

    //mapping the landmark characters withe the respective decimal numbers
    static int decimalValueForRomanChar(char ch) {
        //enhanced switch case, introduced in java 13.
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }

    static int convertRomanToDecimal(String str) {
        int sumForDecimalNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            int valueForFirstCharInPair = decimalValueForRomanChar(str.charAt(i));

            if (i >= 3 && str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i - 2) && str.charAt(i) == str.charAt(i - 3) || valueForFirstCharInPair == -1) {
                System.out.println("Please enter a valid Roman Number");
                return -1;
            }

            if (i + 1 < str.length()) {
                int valueForSecondCharInPair = decimalValueForRomanChar(str.charAt(i + 1));

                if (valueForFirstCharInPair >= valueForSecondCharInPair) {
                    sumForDecimalNumber = sumForDecimalNumber + valueForFirstCharInPair;
                } else {
                    sumForDecimalNumber = sumForDecimalNumber + valueForSecondCharInPair - valueForFirstCharInPair;
                    i++;
                }
            } else {
                sumForDecimalNumber = sumForDecimalNumber + valueForFirstCharInPair;
            }

        }


        return sumForDecimalNumber;
    }

    public static void main(String[] args) {
        System.out.println(convertRomanToDecimal("XXXX"));
    }

}
