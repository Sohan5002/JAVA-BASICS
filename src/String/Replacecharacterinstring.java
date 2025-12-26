package String;

import java.util.Scanner;

public class Replacecharacterinstring {
    public  static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Enter the change character");
       char change = sc.next().charAt(0);
       System.out.println("Enter which character change in String");
        char ch = sc.next().charAt(0);
        System.out.println(str.replace(ch,change));
    }
}


