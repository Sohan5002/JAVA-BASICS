package String;

import java.util.Scanner;

public class Swaptwostringswithouttemp {
    public  static  void  main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
                System.out.println(sb);
    }
}
