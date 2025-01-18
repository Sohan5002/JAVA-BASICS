package Recursion;

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
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  
        printssq(str,"");
    }
}
