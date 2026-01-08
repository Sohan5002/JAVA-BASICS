package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkwithExtraSpace(str);
        checkwithoutExtraSpace(str);
    }

    //StringBuilder sb = new StringBuilder();
    public static void checkwithExtraSpace(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
    public  static  void checkwithoutExtraSpace(String str) {
        System.out.println("WithoutExtra space :");
        StringBuilder sb = new StringBuilder(str);
                System.out.println(sb.reverse());
        }
    }
