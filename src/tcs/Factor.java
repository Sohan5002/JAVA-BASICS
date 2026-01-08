package tcs;

import java.util.Scanner;

public class Factor {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if (num%i==0||num==i)
            {
                System.out.println(i);
            }
            
            sc.close();
        }
    }

}
/*
 * rescursion approch
 *  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + ":");
        printFactors(num, 1); // Start recursion from 1
        sc.close();
    }
 *  static void printFactors(int num, int i) {
        if (i > num) {
            return; // Base case: Stop recursion when i exceeds num
        }
        if (num % i == 0) { // Check if i is a factor
            System.out.println(i);
        }
        printFactors(num, i + 1); // Recursive call with incremented i
    }
 * 
 */