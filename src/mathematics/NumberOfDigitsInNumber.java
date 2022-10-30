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

        if (num == 0) return 1;
        return ((int) Math.floor(Math.log10(num))+1);
    }
    static int findNumberOfDigitsUsingStringClass(int num) {
        return String.valueOf(num).length();
    }

        public static void main(String[] args) {
        System.out.println(findNumberOfDigitsLogarithmic(0));
        System.out.println(findNumberOfDigitsIterative(0));
        System.out.println(findNumberOfDigitsRecursive(0));
            System.out.println(findNumberOfDigitsUsingStringClass(123));
        //the result from logarithmic approach is little unstable
    }
}
