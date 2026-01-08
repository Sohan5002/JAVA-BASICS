package pattern;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        
        char alph = 'A';
        for (int i = 1; i <= num; ++i) {         // Loop for rows
            for (int j = 1; j <= i; ++j) {       // Loop for columns in each row
                System.out.print(alph + " ");    // Print alphabet without newline
            }
            System.out.println();                // Newline after each row
            ++alph;                              // Move to next alphabet
        }
        
        sc.close();  // Close the scanner
    }
}
