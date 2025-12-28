package String;

import java.util.Scanner;

public class Checksubstringpresentornot {
    public static  void main (String  [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String  str = sc.nextLine();
        System.out.println("Enter the substring: ");
        String substr = sc.next();
        if(str.contains(substr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }




}
