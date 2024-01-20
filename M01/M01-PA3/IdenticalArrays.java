/*
 * Name:    Zachary Barrett
 * Date:    01-20-24
 * Program: IdenticalArrays.java
 * Purpose: This program test whether two two-
 *          dimensional arrays are "identical;"
 *          that is, they have the same contents.
 */

import java.util.*;

public class IdenticalArrays {
    public static void main(String[] args) {
        // Prompt user to enter two 3x3 arrays of integers
        System.out.println("Enter 3x3 list 1: ");
        int[][] m1 = getArray(); 
        System.out.println("Enter 3x3 list 2: ");
        int[][] m2 = getArray(); 

        // Display results
        if (equals(m1, m2))
            System.out.println("The two arrays are identical");
        else
            System.out.println("The two arrays are not identical");
        
    }


    // Receive user input for array values
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][3]; // New 3x3 array
        // Build the array using user input
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    // Convert the 3x3 array to a 1x9 array
    public static int[] convert(int[][] m) {
        int[] mArray = new int[m.length * m[0].length];
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                mArray[index]  = m[i][j];
                index++;
            }
        }
        return mArray;
    }

    // Test the two 1x9 arrays for equality
    public static boolean equals(int[][] m1, int[][] m2) {
        // Convert the 3x3s to 1x9s for testing
        int[] mArray1 = convert(m1);
        int[] mArray2 = convert(m2);
        // Sort the arrays
        Arrays.sort(mArray1);
        Arrays.sort(mArray2);

        for (int i = 0; i < 9; i++) {
            // If the arrays don't match, return false
            if (mArray1[i] != mArray2[i]) {
                return false;
            }
        }
        return true; // Arrays match
    }
}
