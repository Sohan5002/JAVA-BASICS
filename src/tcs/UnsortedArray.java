package tcs;

import java.util.HashMap;
import java.util.Scanner;

public class UnsortedArray {
    // Method to remove duplicates from an unsorted array
    public static void RemoveDuplicate(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i])) {
                System.out.print(arr[i] + " "); // Print unique element
                mp.put(arr[i], 1); // Mark element as seen
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        RemoveDuplicate(arr, n);
        input.close(); // Close the scanner
    }
}
