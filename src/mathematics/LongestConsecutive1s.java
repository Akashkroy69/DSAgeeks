package mathematics;

/**
 * Given a number N. Find the length of the longest consecutive 1s in its binary representation.
 * <p>
 * Example 1:
 * <p>
 * Input: N = 14
 * Output: 3
 * Explanation:
 * Binary representation of 14 is
 * 1110, in which 111 is the longest
 * consecutive set bits of length is 3.
 * <p>
 * Example 2:
 * <p>
 * Input: N = 222
 * Output: 4
 * Explanation:
 * Binary representation of 222 is
 * 11011110, in which 1111 is the
 * longest consecutive set bits of length 4.
 */
public class LongestConsecutive1s {

    static int findLongestStreakOf1(int num) {
        int countOfConsecutive1s = 0, currentConsecutive1s = 0;
        int res = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                currentConsecutive1s++;
            } else {
               /* if (currentConsecutive1s >= countOfConsecutive1s) {
                    countOfConsecutive1s = currentConsecutive1s;
                }*/
                currentConsecutive1s = 0;
            }
            res = Math.max(currentConsecutive1s, res);
            num /= 2;
        }

        // if (currentConsecutive1s>countOfConsecutive1s) countOfConsecutive1s = currentConsecutive1s;


        return res;
    }

    public static void main(String[] args) {
        //System.out.println(Integer.toBinaryString(14));
        System.out.println(findLongestStreakOf1(5));
    }
}
