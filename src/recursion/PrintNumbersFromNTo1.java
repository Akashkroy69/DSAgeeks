package recursion;

public class PrintNumbersFromNTo1 {

    static void printFromNTo1(int num) {
        if (num == 0) {
        }
        else {
            System.out.println(num);
            printFromNTo1(num - 1);
        }
    }

    public static void main(String[] args) {
        printFromNTo1(5);
    }
}
