package String;

import java.util.Scanner;

public class Printeachcharacterofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String st = sc.nextLine().replaceAll("\\s+","");
        String str = st;
        for(int i= 0; i< str.length();i++ ) {

            System.out.println(str.charAt(i));
        }
    }
}
