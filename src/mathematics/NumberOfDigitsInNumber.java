package mathematics;

public class NumberOfDigitsInNumber {

    static int findNumberOfDigitsIterative(int num){
        int numberOfDigits = 0;

        if (num == 0) return 1;
        while (num>0){
            num /= 10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }

    static int findNumberOfDigitsRecursive(int num){

        if (num == 0) return 0;

        return 1 + findNumberOfDigitsRecursive(num/10);

    }
    static int findNumberOfDigitsLogarithmic(int num){

        return (int) (Math.floor(Math.log10(num))+1);
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfDigitsLogarithmic(123));
        System.out.println(findNumberOfDigitsIterative(123));
        System.out.println(findNumberOfDigitsRecursive(123));
    }
}
