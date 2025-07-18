package Pattern_Problem;

// *********
//  *******
//   *****
//    ***
//     *

public class Problem_7 {
    public static void main(String[] args) {
        int numRows = 5; // You can change this to generate a different sized pattern

        // Outer loop: Iterates through each row
        // 'i' represents the current row number (from 1 to numRows)
        for (int i = 1; i <= numRows; i++) {

            // Inner Loop 1: Prints leading spaces
            // The number of spaces is (i - 1)
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" "); // Print a space
            }

            // Inner Loop 2: Prints stars
            // The number of stars is (2 * (numRows - i)) + 1
            for (int k = 1; k <= (2 * (numRows - i)) + 1; k++) {
                System.out.print("*"); // Print a star
            }

            System.out.println(); // Move to the next line after completing a row
        }
    }
}
