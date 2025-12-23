package Recursion;
import java.util.Scanner;

public class Reverse {
    public static String reverse1(String str, int index) {
        // Base case
        if(index >= str.length()) return "";
        // Recursive step
        String smallans = reverse1(str, index+1);
        // Self-work
       return smallans+str.charAt(index);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine(); 
            String result = reverse1(str,0);
            System.out.println(result);
        }
    }
}
