package recursion;

public class StringPallindromeUsingRecursion {
    static boolean isPallindromeUsingRecursion(String str) {
        int i = 0, j = str.length() - 1;
       // if (j == -1) j++;
        System.out.println(str);
        if (i == j || i > j) return true;
        else if (str.charAt(i) == str.charAt(j)) {
            return isPallindromeUsingRecursion(str.substring(i + 1, j));
        } else return false;
    }

    public static void main(String[] args) {
       /* String str = "akash";
        System.out.println(str.substring(1, str.length() - 1));*/
        System.out.println(isPallindromeUsingRecursion("aa"));
    }
}
