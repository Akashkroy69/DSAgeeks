package pattern;

public class NForest {
    // Method to print the N-dimensional forest
    public static void nForest(int n) {
        // Check if the value of n is valid
        if (n < 1 || n > 25) {
            return;
        }

        // Using two nested loops to print the forest
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("* "); // Print star with space
                j = j + 1;
            }
            System.out.println(); // Move to the next line after each row
            i = i + 1;
        }
    }

    // Main method to test the nForest function
    public static void main(String[] args) {
        nForest(5); // Calling the method with an example value
    }
}
