package tcs;

import java.util.Scanner;

public class Greatestcommon {
    public static int gcd(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd; // Return the calculated GCD
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int find = gcd(num1, num2);
            System.out.println("GCD: " + find); // Added space for better readability
            // Close the scanner to avoid resource leak
        }
    }
}