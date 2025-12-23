package tcs;

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int original = num;
            int result;
            int temp = 0;

            while (num != 0) {
                result = num % 10; // Extract the last digit
                temp += result;   // Add it to the sum of digits
                num = num / 10;   // Remove the last digit
            }

            // Check if the original number is divisible by the sum of its digits
            if (temp != 0 && original % temp == 0) {
                System.out.println("Yes, it is a Harshad number.");
            } else {
                System.out.println("No, it is not a Harshad number.");
            }
        }
    sc.close();
    }
}
