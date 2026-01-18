package SortingAlgo.BinarySearch;

import java.util.Scanner;

public class SearchTarget {
    public static int  Search(int []arr,int start, int end,int target)
    {if(start>end)return -1;

        int mid =  start+(end-start)/2;

        if(target==arr[mid]) return mid;

        else if(target<arr[mid])

        return Search(arr, start, mid-1, target);
    
      else {
        return Search(arr, mid+1, end, target);
      }


    }
    public static void main(String[] args) {
        try (Scanner sc = new  Scanner(System.in)) {
            int n= sc.nextInt();
            int target= sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
             int result = Search(arr, 0,arr.length-1,target);
             if(result!=-1){
             System.out.println( "Target found at index  " + result);
             }
             else{
                System.out.println("Target is not  found");
             }
        }
    }
}
