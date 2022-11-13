package recursion;

/**
 * Given a string str, print all substrings of it. (In any order)
 * <p>
 * ex: i/p: "ABC"
 * o/p: "", "A", "B", "C", "AB", "AC", "BC", "ABC"
 * Approach:
 */
public class SubStrings {
    static final String startingString = "";
    static final int startingIndex = 0;

    static void printSubStrings(String str, String currentString, int index) {
        if (index == str.length()){
            System.out.println(currentString);
            return;
        }

        printSubStrings(str, currentString, index + 1);
        printSubStrings(str, currentString.concat(String.valueOf(str.charAt(index))), index + 1);

    }

    public static void main(String[] args) {

          printSubStrings("ABC", startingString, startingIndex);
    }
}
