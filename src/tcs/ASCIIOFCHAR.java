package tcs;

import java.util.Scanner;

public class ASCIIOFCHAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read the first character of the input
        int ascii = (int) ch;          // Get the ASCII value of the character
        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
        sc.close();
    }
}
