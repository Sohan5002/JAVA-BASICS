package String;

import java.util.Scanner;

public class Capitalizefirstletterofeachword {
    public  static  void main  (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String[] arr = str.trim().split("\\s+");
        //String res = "";
        StringBuilder sb = new StringBuilder();

        for (String t : arr) {
            if (!t.isEmpty()) {

                String first = t.substring(0, 1).toUpperCase();
                String sec = t.substring(1).toLowerCase();
                sb.append(first).append(sec).append(" ");
            }
        }
        System.out.println(sb);
    }}
/*
package String;

import java.util.Scanner;

public class Capitalizefirstletterofeachword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
''

        StringBuilder sb = new StringBuilder();
        boolean newWord = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                sb.append(ch);
                newWord = true;
            } else {
                if (newWord) {
                    sb.append(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
        }

        System.out.println(sb.toString());
    }
}

 */