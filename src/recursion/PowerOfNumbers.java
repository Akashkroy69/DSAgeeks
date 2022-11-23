package recursion;

/**
 *
 */
public class PowerOfNumbers {
    static int val = 1000000007;

    static int findPowerOfNumbers(int num, int revNum) {

        if (revNum == 1) return num;
        if (revNum % 2 == 1) return (num * findPowerOfNumbers(num, revNum - 1)) % val;
        return (findPowerOfNumbers(num, revNum / 2) * findPowerOfNumbers(num, revNum / 2));
        //return 1;
    }

    public static void main(String[] args) {
        System.out.println(findPowerOfNumbers(12, 21));
    }
}
