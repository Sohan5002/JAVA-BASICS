package tcs;

import java.util.Scanner;

public class reverseString {
    public static void reverse(String str) {
        String result = "";  // Initialize an empty string to store the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {  // Start from the last character
            result += str.charAt(i);  // Append each character to the result
        }
        System.out.println(result);  // Print the reversed string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // Take user input
        reverse(str);  // Call the reverse method to reverse the string
        sc.close();  // Close the scanner
    }
}
