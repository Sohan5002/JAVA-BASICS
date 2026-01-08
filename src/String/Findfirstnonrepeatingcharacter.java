package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Findfirstnonrepeatingcharacter {
        public  static  void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String:");
            String st = sc.nextLine();

            String str  = st.toLowerCase().replaceAll("\\s+","");
            removeduplicate(str);
            removeduplicatebyorder(str);
        }
        // inorder approach isme lexographical order me print hoga
        public static void removeduplicate(String str) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            System.out.println("According to lexographical order:");
            for (char c : map.keySet()) {
                if (map.get(c) == 1) {
                    System.out.print(c);
                    return;
                }
            }
        }
        public static void removeduplicatebyorder (String str){
            LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
            System.out.println();
            System.out.println("According to input order: ");
            for (char c : map.keySet()) {
                if (map.get(c) == 1) {
                    System.out.print(c);
                    return;
                }
            }
        }
    }

