package recursion;

public class FactorialUsingRecursion {

    static int findFactorialOfN(int num){
        if (num == 1) return 1;
        else return num * findFactorialOfN(num-1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorialOfN(5));
    }
}
