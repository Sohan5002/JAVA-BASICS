<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

import java.util.Scanner;

public class SSQ {
    public static void printssq(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String remString = str.substring(1);
        printssq(remString, ans+ch);
        printssq(remString, ans);
      
    }
    public static void main(String[] args) {
<<<<<<< HEAD
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();  
            printssq(str,"");
        }
=======
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  
        printssq(str,"");
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
    }
}
