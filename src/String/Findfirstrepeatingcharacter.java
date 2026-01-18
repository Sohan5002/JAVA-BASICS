package String;

import java.util.*;

public class Findfirstrepeatingcharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String str = st.toLowerCase().replaceAll("\\s+", "");

        repeatingCharacterByLexographical(str);
        repeatingCharacterByInputOrder(str);
    }

    // 🔹 Lexicographical order (a–z)
    public static void repeatingCharacterByLexographical(String str) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("According to lexographical:");
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println(c);
                return;
            }
        }
    }

    // 🔹 Input order
    public static void repeatingCharacterByInputOrder(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("According to input order:");
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println(c);
                return;
            }
        }
    }
}
