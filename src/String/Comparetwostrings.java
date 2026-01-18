package String;

import java.util.Scanner;

public class Comparetwostrings {
    public  static  void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the String1");
        String str = sc.nextLine();
        System.out.println("Enter the the String2");
        String str1 = sc.nextLine();

        if (str.equals(str1)) {
            System.out.println("Both strings are same");
        } else {
            System.out.println("Strings are not same");
        }

    }
 }
