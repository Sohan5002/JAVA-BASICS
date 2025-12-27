package String;

import java.util.Scanner;

public class Countwordsinastring {
    public  static  void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentance: ");
        String  str = sc.nextLine().trim();
        String [] arr =str.split("\\s+");

        System.out.println("Number of words is: "+ arr.length);

    }
}
