package recursion;

import java.util.Scanner;

public class Removeoccurance {
    public static String occurance(String str, String removelement, int index) {
        // Base case
        if (index >= str.length()) return "";
        
        // Recursive step
        String smallans = occurance(str, removelement, index + 1);
        
        // Self-work
        char current = str.charAt(index);
        if (current != removelement.charAt(0))
        {
            return current + smallans; // Include the character
        } else {
            return smallans; // Exclude the character
        } // Exclude the character
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String removelement = sc.nextLine();
        String result = occurance(str, removelement, 0);
        System.out.println(result);
    }
}
