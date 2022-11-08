package string;

public class StringPallindrome {

    static boolean isPallindrome(String str) {
        for (int i = 0, j = str.length() - 1; i <= str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPallindrome("geeks"));
    }
}
