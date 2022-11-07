package recursion;

public class FactorialUsingTailRecursion {
    static final int startingPoint = 1;
    static int findFactorialOfN(int num, int val) {
        if (num == 0) return val;
        else return findFactorialOfN(num - 1, num * val);
        //Is this a Tail recursion solution???
        //YES
    }

    public static void main(String[] args) {
        System.out.println(findFactorialOfN(5,startingPoint));
    }
}
