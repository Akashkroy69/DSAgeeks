package bitmagic;

/**
 * given a number, check whether the Kth bit is set or not
 * ex: n =5 --> 101; k=1, set; k=2, not set;
 * <p>
 * logic: left shift 1 by k-1 then perform & operation if we find 0 then Kth bit is SET otherwise it is not set.
 */
public class KthBitSetOrNot {

    static boolean checkKthBitSetOrNot(int number, int k) {
        System.out.println("number " + number + " " + DecimalToBinaryConversion.convertDecimalToBinary(number));
        System.out.println(DecimalToBinaryConversion.convertDecimalToBinary(1 << (k - 1)));
        return (number & (1 << (k - 1))) != 0;
    }

    public static void main(String[] args) {
        System.out.println(checkKthBitSetOrNot(39, 5));
    }
}
