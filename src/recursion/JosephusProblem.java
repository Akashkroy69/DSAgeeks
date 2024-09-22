package recursion;

/**
 * source: https://practice.geeksforgeeks.org/batch/gc-tutorials-dsa/track/PC-W1-R/problem/game-of-death-in-a-circle1840
 * <p>
 * <p>
 * Game Of death, Josephus problem
 * <p>
 * <p>
 * There are n people standing in a circle (numbered clockwise 1 to n) waiting to be executed.
 * The counting begins at point 1 in the circle and proceeds around
 * the circle in a fixed direction (clockwise). In each step, a certain number of people are skipped and the
 * next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the
 * executed people are removed), until only the last person remains, who is given freedom.
 * Given the total number of persons n and a number k which indicates that k-1 persons are skipped and
 * kth person is killed in circle. The task is to choose the place in the initial circle so that you are the last one
 * remaining and so survive.

 */
public class JosephusProblem {
    static int findTheSafePlace(int n, int k) {
        if (n == 1) return 1;

        return (findTheSafePlace(n - 1, k) + k - 1) % n + 1;
    }
}
