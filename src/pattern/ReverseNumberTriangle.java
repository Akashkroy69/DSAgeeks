package pattern;

public class ReverseNumberTriangle {
        // Method to print the number triangle pattern
        public static void nNumberTriangle(int n) {
            // Check if n is within the valid range
            if (n < 1 || n > 25) {
                return;
            }

            // Outer loop controls the rows, starting from n and decreasing to 1
            int maxRow = n;
            while (maxRow >= 1) {
                int col = 1;

                // Inner loop prints numbers from 1 to maxRow in each row
                while (col <= maxRow) {
                    System.out.print(col + " "); // Print column number with a space
                    col++;
                }
                System.out.println(); // Move to the next line after each row
                maxRow--; // Decrease the row count
            }
        }

        // Main method to test the nNumberTriangle function
        public static void main(String[] args) {
            nNumberTriangle(5); // Test with an example input of 5
        }

}
