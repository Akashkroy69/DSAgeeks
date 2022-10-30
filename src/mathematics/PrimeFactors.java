package mathematics;

/**
 * Prime factors: https://practice.geeksforgeeks.org/batch/gc-tutorials-dsa/track/PC-W1/problem/prime-factors5052
 */
public class PrimeFactors {
    static int[] findArrayOfPrimeFactors(int num) {

        StringBuilder str = new StringBuilder();

        int lastAdded = 0, j = 0;

        while (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    if (i != lastAdded) {
                        lastAdded = i;
                        System.out.println(i);
                        str.append(i);
                        //arrOfPrimeFactors[j++] = i;
                    }
                    num /= i;
                    break;
                }
            }
        }
        //System.out.println(str);
        return str.chars().toArray();
    }

    public static void main(String[] args) {
        System.out.println(findArrayOfPrimeFactors(8361));
    }
}
