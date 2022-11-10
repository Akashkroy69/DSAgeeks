package recursion;

public class TowerOfHanoi {
    static int count = 0;

    public static long toh(int N, int from, int to, int aux) {
        // Your code here
        if (N >= 1) {
            toh(N - 1, from, aux, to);
            count++;
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            toh(N - 1, aux, to, from);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(toh(2, 1, 2, 3));
    }
}
