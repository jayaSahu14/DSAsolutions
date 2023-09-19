package DataStructures.Arrays;

import java.util.Arrays;

public class fill {

    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int cols = 4; // Number of columns
        
        // Create a 2D array
        int[][] array = new int[rows][cols];
        
        // Fill the array with -1 using Arrays.fill()
        for (int i = 0; i < rows; i++) {
            Arrays.fill(array[i], -1);
        }
        
        // Print the array to verify the values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        
        
        int dp[]= new int[9];
        Arrays.fill(dp, -2);
        for (int i = 0; i < 9; i++) {
        	System.out.print(dp[i]);
        }
                
    }
}