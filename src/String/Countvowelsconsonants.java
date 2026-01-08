package String;

import java.util.Scanner;

public class Countvowelsconsonants {
public  static  void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().trim();
    countvc(str);
}// Approch 1
public  static  void countvc(String str) {
    int countV =0;
    int countC =0;
    int countS =0;
    String st = str.toLowerCase();
    for(int i =0; i<st.length(); i++) {
        if (str.charAt(i) == 'a' ||
                str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u'
        ) {
            countV++;
        } else if (str.charAt(i) == ' ') {
            countS++;

        } else {
            countC++;
        }
    }
        System.out.println("Number of Vowels; " + countV);
        System.out.println("Number of Consonents " + (countC - countS));
        System.out.println("Number of Space :"+ countS);


}

// Approch 2

    public static void countVC(String str) {
        int vowels = 0, consonants = 0, spaces = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }

}
