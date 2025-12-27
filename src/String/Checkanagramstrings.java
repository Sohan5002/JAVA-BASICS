package String;

import java.util.Arrays;
import java.util.Scanner;

public class Checkanagramstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.println("Enter string 2:");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("Its an anagram");
        } else {
            System.out.println("Its not an anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2) {

        // length check
        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        // manual Arrays.equals logic
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
