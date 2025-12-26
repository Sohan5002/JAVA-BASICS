package String;

import java.util.Scanner;

public class Checkpalindromestring {

    public  static  void  main(String  []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        char []ch = str.toCharArray();
           checkPalindrom(ch);
           isPalindrome(str);
    }
    // aproch 1
  public  static  void checkPalindrom(char [] ch) {
      int start = 0;
      int end = ch.length - 1;
      while (start < end) {
          if (ch[start] != ch[end]) {
              System.out.println("Its not palindrome");
              return;
          }
              start++;
              end--;

      }
      System.out.println("Its a palindrome");

  }
 // approch 2

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}

