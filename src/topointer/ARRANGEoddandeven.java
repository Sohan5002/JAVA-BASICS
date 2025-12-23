package topointer;

import java.util.*;

public class ARRANGEoddandeven {
    
    // Method to arrange odd and even numbers in the array
    public static void moveZero(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // If arr[left] is even and arr[right] is odd, swap them
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } 
            // If arr[left] is odd, just move left pointer to the right
            else if (arr[left] % 2 == 0) {
                left++;
            } 
            // If arr[right] is even, just move right pointer to the left
            else {
                right--;
            }
        }
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // Main method to execute the logic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method to arrange odd and even numbers
        moveZero(arr);

        // Output the modified array
        System.out.println(Arrays.toString(arr));

        // Close scanner
        sc.close();
    }
}
