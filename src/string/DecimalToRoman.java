package string;

/**
 * given a decimal number, convert this to a Roman number.
 * ex: 3457 --> MMM CD L VII
 *
 * Algorithm:
 * 1. create an int array of all the landmark numbers. The landmark numbers are: 1,4,5,9,10,40,50,90,100,400,500,900,1000
 * 2. create a string array which will hold the "symbols" for landmark numbers in the respective indexes.
 * 3. create a StringBuilder object for mutable string as we will keep finding the char for numbers and will add to it.
 * 4. check whether the number we have is greater than which biggest landmark number. If the number is bigger than
 * 1000 then add "M" in the mutable string and deduct 1000 from the given number.
 * 5. keep repeating the step 4 until num becomes 0.
 **/
public class DecimalToRoman {

    static String convertDecimalToRoman(int num) {
        int[] landmarkNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbolsForLandmarkNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //for mutable string
        StringBuilder romanNumberStr = new StringBuilder();
        while (num > 0) {
            for (int i = 0; i <landmarkNumbers.length;i++){
                if (num>=landmarkNumbers[i]){
                    romanNumberStr.append(symbolsForLandmarkNumbers[i]);
                    num -= landmarkNumbers[i];
                    break;
                }
            }
        }
        return romanNumberStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertDecimalToRoman(3457));
    }
}
