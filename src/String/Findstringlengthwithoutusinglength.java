package String;

import java.util.Scanner;

public class Findstringlengthwithoutusinglength {
public  static  void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the  String:");
    String str = sc.nextLine();
    int count = 0;
    for (char c : str.toCharArray()) {
        count++;
    }

    System.out.println(count);
}
}
