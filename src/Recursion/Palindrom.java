package recursion;

import java.util.Scanner;

public class Palindrom {
    public static boolean check(String str, int start, int end) {
      if(start >= end) return true;

        return (str.charAt(start) == str.charAt(end)) && check(str, start+1, end-1);
      }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      boolean result= check(str, 0, str.length()-1);
      if(result) System.out.println("Yes");
      else System.out.println("No");

    }
}
