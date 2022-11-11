package recursion;

public class SumOfNumbersUsingRecursion {

    static int findSumOfNumbersUsingRecursion(int num) {
        if (num / 10 == 0) return num;
        return num % 10 + findSumOfNumbersUsingRecursion(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(findSumOfNumbersUsingRecursion(0));
    }
}
