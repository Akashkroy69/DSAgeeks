package pattern;

public class Triangle {
    // Method to print the triangular pattern with row numbers
    public static void triangle(int n) {
        // Check if the value of n is valid
        if (n < 1 || n > 25) {
            return;
        }

        // Using two nested loops to print the triangle
        int row = 1;
        while (row <= n) {
            int counter = 1;
            while (counter <= row) {
                System.out.print(row + " "); // Print row number with a space
                counter += 1;
            }
            System.out.println(); // Move to the next line after each row
            row += 1;
        }
    }

    // Main method to test the triangle function
    public static void main(String[] args) {
        triangle(5); // Calling the method with an example value
    }
}
