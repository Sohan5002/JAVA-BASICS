package String;

import javabasics.Methods;

import java.util.Scanner;

public class Countdigitslettersspecialcharacters {
    public  static  void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        countAll(str);
        beteraproch(str);
    }
    public  static  void countAll(String str) {
        int letter =0;
        int digit =0;
        int symbol =0;
        for(int i =0; i<str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i)<= '9') {
                digit++;
            } else  if (str.charAt(i) >= 'A' && str.charAt(i)<= 'Z' || str.charAt(i)>='a' && str.charAt(i)<='z') {
                letter++;
            } else {
                symbol++;
            }
        }
        System.out.println("Number of character: " + letter);
        System.out.println("Number of Digit "+ digit);
        System.out.println("Number of Symbols "+ symbol);



    }
    public static void beteraproch(String str)  {
        int letter =0;
        int digit =0;
        int symbol =0;
         for(char ch: str.toCharArray()) {
             if(Character.isLetter(ch))  {
                 letter++;
             } else if (Character.isDigit(ch)) {
                 digit++;
             } else {
                 symbol++;
             }
        }
        System.out.println("Number of character: " + letter);
        System.out.println("Number of Digit "+ digit);
        System.out.println("Number of Symbols "+ symbol);


    }
}
