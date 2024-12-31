package tcs;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms:");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (num == 1) {
            System.out.println("Fibonacci sequence: 0");
        } else {
            int[] arr = new int[num]; // Initialize the array
            arr[0] = 0; // First term
            arr[1] = 1; // Second term

            System.out.print("Fibonacci sequence: " + arr[0] + " " + arr[1] + " ");

            for (int i = 2; i < num; i++) {
                arr[i] = arr[i - 1] + arr[i - 2]; // Calculate next Fibonacci number
                System.out.print(arr[i] + " "); // Print each term
            }
            System.out.println(); // For a clean output
        }

        sc.close();
    }
}
