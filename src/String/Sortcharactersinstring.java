package String;

import java.util.Scanner;

public class Sortcharactersinstring {
    public static  void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String  str = sc.nextLine().trim();
        int count =Integer.MAX_VALUE;
    String[]arr = str.split("\\s+");
    for(int i =0; i<arr.length; i++) {
        System.out.println(arr[i] +" " + arr[i].length());
           if(count > arr[i].length()) {
               count = arr[i].length();
           }
    }
    System.out.println("Sortest string is : "+count);
    }


}
/*
       // 🔹 hidden test case: empty string
        if (str.length() == 0) {
            System.out.println("No words found");
            return;
        }

        String[] arr = str.split("\\s+");

        int count = Integer.MAX_VALUE;

        // 🔹 FIRST for loop: shortest length nikaalo
        for (int i = 0; i < arr.length; i++) {
            if (count > arr[i].length()) {
                count = arr[i].length();
            }
        }

        // 🔹 SECOND for loop: shortest word(s) print karo
        System.out.println("Shortest word(s):");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == count) {
                System.out.println(arr[i]);
            }
        }
    }
}

 */