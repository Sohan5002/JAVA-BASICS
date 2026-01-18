package String;

import java.util.Scanner;

public class Checkifstringcontainsacharacter {
    public  static  void  main(String  []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
       checkChar(str,ch);
    }
    public static void checkChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }



}
