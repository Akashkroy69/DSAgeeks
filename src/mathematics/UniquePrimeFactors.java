package mathematics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Prime factors: https://practice.geeksforgeeks.org/batch/gc-tutorials-dsa/track/PC-W1/problem/prime-factors5052
 */
public class UniquePrimeFactors {
    static int[] findArrayOfPrimeFactors(int num) {

        ArrayList<Integer> arrayList = new ArrayList();
        int lastAdded = 0;

        if (num == 2) return new int[]{2};
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                if (i != lastAdded) {
                    lastAdded = i;
                    System.out.println(lastAdded);
                    arrayList.add(lastAdded);
                }
                num /= i;
                i--;
            }
        }
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }

        return arr;
    }



    public static void main(String[] args) {
        System.out.println(findArrayOfPrimeFactors(2));

        for (int i = 0; i < findArrayOfPrimeFactors(2).length; i++) {
            System.out.println(findArrayOfPrimeFactors(2)[i]);
        }

    }
}
