package recursion;

public class FactorialUsingRecursion {

    static int findFactorialOfN(int num){
        if (num == 1) return 1;
        else return num * findFactorialOfN(num-1);
        //Is this a Tail recursion solution???
        //ANS: NO, definitely after this line no other lines are  there to execute but the control has to be shifted
        //from last record in the stack to an earlier record in the stack.
    }

    public static void main(String[] args) {
        System.out.println(findFactorialOfN(5));
    }
}
