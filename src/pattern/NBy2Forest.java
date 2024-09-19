package pattern;

public class NBy2Forest {
    // Method to print the N-dimensional triangular forest
    public static void nForest(int n) {
        // Check if the value of n is valid
        if (n < 1 || n > 25) {
            return;
        }

        // Using two nested loops to print the forest
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print("* "); // Print star with space
                col = col + 1;
            }
            System.out.println(); // Move to the next line after each row
            row = row + 1;
        }
    }

    // Main method to test the nForest function
    public static void main(String[] args) {
        nForest(5); // Calling the method with an example value
    }
}

