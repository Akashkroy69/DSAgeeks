package bitmagic;

public class DecimalToBinaryConversion {
    static String convertDecimalToBinary(int decimalN) {
        StringBuilder binaryString = new StringBuilder();

        while (decimalN >= 1) {
            int remainder = decimalN % 2;
            //System.out.println(remainder);
            binaryString.append(remainder);
            decimalN /= 2;
        }
        return binaryString.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(39));
    }
}
