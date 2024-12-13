package tcs;

import java.util.*;

public class AllSymmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        // Ensure valid input for a matrix of pairs
        if (col != 2) {
            System.out.println("Invalid input: The matrix should have exactly 2 columns to find symmetric pairs.");
            sc.close();
            return;
        }

        // Initialize the 2D array
        int[][] arr = new int[row][col];

        // Input the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Use a HashMap to find symmetric pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Symmetric pairs are:");
        for (int i = 0; i < row; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            // Check if the reverse pair already exists
            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + second + ", " + first + ")");
            } else {
                // Add the current pair to the map
                map.put(first, second);
            }
        }

        sc.close();
    }
}
