package pattern;

public class NTriangle {
    // Method to print the N-dimensional triangular pattern with numbers
    public static void nTriangle(int n) {
        // Check if the value of n is valid
        if (n < 1 || n > 25) {
            return;
        }

        // Using two nested loops to print the triangle
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(col + " "); // Print column number with a space
                col = col + 1;
            }
            System.out.println(); // Move to the next line after each row
            row = row + 1;
        }
    }

    // Main method to test the nTriangle function
    public static void main(String[] args) {
        nTriangle(5); // Calling the method with an example value
    }
}
