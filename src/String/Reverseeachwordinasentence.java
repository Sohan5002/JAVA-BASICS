package String;

import java.util.Scanner;

public class Reverseeachwordinasentence{
    public static void main(String[] args) {
        String str = "Java is very easy";

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
// APPROCH ONE
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
