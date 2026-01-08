package String;

import java.util.Scanner;
public class Removespacesfromstring {
     public  static  void main(String [] args) {

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the String: ");
          String str = sc.nextLine();

          // normal way
          System.out.println(str.replace(" ",""));
          // advance way
          System.out.println(str.replaceAll("\\s+", ""));
          /*
          String change = sc.nextLine();
          System.out.println("replace the string in given string: ");
          String character = sc.nextLine();
          System.out.println(str.replaceAll(change,character));
*/


     }
}
