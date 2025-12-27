package String;

import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Scanner;

public class Findduplicatecharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countFreq(str);
        findDuplicates(str);
    }
//  aprroch 1st  time and space o(n)
    public static void countFreq(String str) {
        String s = str.toLowerCase().replaceAll("\\s+", "");
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char k : map.keySet()) {
            if (map.get(k) > 1) {
                System.out.print(k);
            }
        }}

    // Approch 2nd time o(N) and  space  o(1)
            public static void findDuplicates (String str){
                str = str.toLowerCase().replaceAll("\\s+", "");

                int[] freq = new int[26];

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch >= 'a' && ch <= 'z') {
                        freq[ch - 'a']++;
                    }
                }

                System.out.println("Duplicate characters:");
                for (int i = 0; i < 26; i++) {
                    if (freq[i] > 1) {
                        System.out.println((char) (i + 'a') + " -> " + freq[i]);
                    }
                }
            }

        }

