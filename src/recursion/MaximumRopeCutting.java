package recursion;

/**
 * source: question and explanation is in the video course taken from Geeksforgeeks.
 * <p>
 * Maximum Product Cutting
 * Given a rope of length n.
 * max num of pieces you can make such that length of every piece is in
 * set {a,b,c} for the given values a,b,c
 * <p>
 * ex:1
 * I/p: 23, a = 12, b = 9, c = 11
 * o/p: 2
 * <p>
 * ex:2
 * i/p: 5, a,b,c: 2,5,1
 * o/p: 5
 * <p>
 * i/p: n=5, a,b,c: 4,2,6
 * o/p: -1
 */
public class MaximumRopeCutting {

    static int findMaximumRopeCutting(int ropeLength, int a, int b, int c) {
        if (ropeLength == 0) return 0;
        if (ropeLength < 0) return -1;
        int maxNumberOfRopeCuts = Math.max(
                Math.max(findMaximumRopeCutting(ropeLength - a, a, b, c),
                        findMaximumRopeCutting(ropeLength - b, a, b, c)),
                findMaximumRopeCutting(ropeLength - c, a, b, c));
        if (maxNumberOfRopeCuts == -1) return -1;
        return maxNumberOfRopeCuts + 1;
    }

    public static void main(String[] args) {
        System.out.println(findMaximumRopeCutting(23, 12, 9, 11));
        System.out.println(findMaximumRopeCutting(5, 2, 5, 1));
        System.out.println(findMaximumRopeCutting(5, 4, 2, 6));
    }
}
