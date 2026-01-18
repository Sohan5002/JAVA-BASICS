package String;

import java.util.HashMap;
import java.util.Scanner;


public class Countfrequencyofeachcharacter {
    public static  void main(String[]args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string ");
        String st = sc.nextLine();
           String  str = st.toLowerCase();
        countCharacter(str);

    }

    public  static void  countCharacter(String str) {
        HashMap<Character,Integer>  map = new HashMap<>();
        for(int i =0; i<str.length();  i++) {

            char ch  = str.charAt(i) ;
            if(ch  == ' ') continue;

            if(map.containsKey(ch)) {

                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch,1);
            }

        }
        for(char c: map.keySet()) {
            System.out.println(c + " -> " + map.get(c));

        }
    }





}
