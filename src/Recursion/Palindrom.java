<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

import java.util.Scanner;

public class Palindrom {
    public static boolean check(String str, int start, int end) {
      if(start >= end) return true;

        return (str.charAt(start) == str.charAt(end)) && check(str, start+1, end-1);
      }
    
    public static void main(String[] args) {
<<<<<<< HEAD
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            boolean result= check(str, 0, str.length()-1);
            if(result) System.out.println("Yes");
            else System.out.println("No");
        }
=======
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      boolean result= check(str, 0, str.length()-1);
      if(result) System.out.println("Yes");
      else System.out.println("No");

>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
    }
}
