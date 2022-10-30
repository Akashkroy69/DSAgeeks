package mathematics;

public class CountNumberOfDigitsInFactorial {


    static int numberOfDigitsInFactorialOfNumber(int num) {
        long res = 1;
        for (int i = num; i > 0; i--) {

            res *= i;
        }
        return (int) Math.log10(res) + 1;
    }

    //the upper method will not work when the value of factorial is too big to store in a int/long
    //In such case we would use a mathematical trick to solve this problem.
    //we know log(a*b) = loga + logb
    //just like that log(5!) = log(5*4*3*2*1) = log5 + log4 + log3 + log2 + log1
    //we know that log(n)+1 gives number of digits in n.
    //so log(5!)+1 will give number of digits in 5!
    //So here, we will run a loop and will find log of each factor in the factorial, will add them all and at last will add 1 to the sum
    //that will be the number of digits in the factorial of any number.
    static int numberOfDigitsInFactorialOfNumberUsingLogTRICK(int num) {
        double numOfDigitsInFactorial = 0;
        for (int i = num; i > 0; i--) {
            numOfDigitsInFactorial += Math.log10(i);
        }
        return (int) Math.floor(numOfDigitsInFactorial) + 1;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDigitsInFactorialOfNumber(27));
        System.out.println(numberOfDigitsInFactorialOfNumberUsingLogTRICK(27));
    }
}
