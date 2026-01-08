package String;

import java.util.Scanner;

public class Removevowelsfromstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim().toLowerCase().replaceAll(" ","");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
