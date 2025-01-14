
// For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing orde
package topointer;

import java.util.Scanner;

public class Squreofarray {
    public static void check(int []arr)
    {
        int left=0;
        int right =arr.length-1;
        while (left<=right) {
            if(Math.abs(left)>Math.abs(right))
            {
                
            }
            
        }
    }
        
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        check(arr);

}
}