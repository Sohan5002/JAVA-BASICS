package String;

import java.util.Scanner;

public class Checkifstringcontainsonlydigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine().trim();

        boolean check = true;   // ✅ loop ke bahar

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                check = false;
                break;
            }
        }

        if (check && str.length() > 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
