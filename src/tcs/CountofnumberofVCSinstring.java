package tcs;

import java.util.Scanner;

public class CountofnumberofVCSinstring {
    public static void check(String str1) {
        int vowels = 0;
        int whitespace = 0;
        int consonants = 0;
        
        // Convert to lowercase for easier checks
        String str = str1.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check for whitespace
            else if (ch == ' ') {
                whitespace++;
            }
            // Check for consonants
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Whitespace: " + whitespace);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        check(str1);
        sc.close();
    }
}
