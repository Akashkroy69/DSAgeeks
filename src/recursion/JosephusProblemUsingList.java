package recursion;

import java.util.ArrayList;
import java.util.List;
/**
 * Step 1: Create a list that contains numbers from 1 to n.
 * step 2: if the size of the list is 1 then return list.get(0).
 * step 3: else set the index where man has to be executed. index = (index + k)% list_size
 * step 4: remove an element at index now.
 * step 5: call the recursive function on the new list.
 *
 * */

public class JosephusProblemUsingList {

    static int findWinner(List list, int start, int k) {

        if (list.size() == 1) return (int) list.get(0);

        start = (start + k-1) % list.size();

        list.remove(start);
        return findWinner(list, start, k);//O(n)

    }

    static int findJosephus(int n, int k) {
        List<Integer> listFrom1Ton = new ArrayList();
        for (int i = 1; i <= n; i++) { //o(n)
            listFrom1Ton.add(i);
        }

        return findWinner(listFrom1Ton, 0, k);
    }

    public static void main(String[] args) {
        System.out.println(findJosephus(5, 2));
    }
}
