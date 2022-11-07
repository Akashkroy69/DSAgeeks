package recursion;

public class PrintFrom1ToN {

    static void printFrom1ToN(int num) {
        if (num != 1) {
            printFrom1ToN(num - 1);
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        printFrom1ToN(5);
    }
}
