package Recursion;

import java.util.Scanner;

public class sumofallsubset {
   public static void sumset(int[] arr, int i, int sum){
    if(i>=arr.length){
        System.out.println(sum);
        return;
    }
    sumset(arr, i+1, sum+arr[i]);//Not including the element
    sumset(arr, i+1, sum);//    Including the element
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){     
            arr[i] = sc.nextInt();  
        }
        sumset(arr, 0, 0);
        sc.close();
    }
}
