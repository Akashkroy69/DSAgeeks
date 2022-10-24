package bitmagic;

public class BinaryToDecimal {

    static int convertBinaryToDecimal(String binStr) {

        int sum = 0;
        for (int i = binStr.length() - 1, j = 0; i >= 0; i--, j++) {
            sum = (sum + Character.getNumericValue(binStr.charAt(i)) * (int) Math.pow(2, j));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(convertBinaryToDecimal("100111"));
    }
}
