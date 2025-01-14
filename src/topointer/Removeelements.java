package topointer;
import java.util.Arrays;
import java.util.Scanner;

public class Removeelements {
    public static int elements(int[] arr, int val) {
        Arrays.sort(arr); // Sort the array
        int index = 0; // Pointer for unique elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) { // Keep elements not equal to val
                arr[index] = arr[i];
                index++;
            }
        }
        return index; // Return the new length of the array
    }

    public static void main(String[] args) { // Corrected method signature
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the value to remove: ");
        int val = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int newLength = elements(arr, val); // Call method and store the new length
        System.out.println("Array after removing elements equal to " + val + ":");
        for (int i = 0; i < newLength; i++) { // Print only the valid portion of the array
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew length of the array: " + newLength);

        sc.close(); // Close the scanner
    }
}
