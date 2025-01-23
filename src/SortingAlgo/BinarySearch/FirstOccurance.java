package SortingAlgo.BinarySearch;

import java.util.Scanner;

public class FirstOccurance {
    public static int  Search(int []arr,int target)

    { int  start=arr[0];
        int fo= -1;
        int end =arr.length-1;
        while(start <= end)
    {
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
         fo=mid;
        end= mid-1;
        }
        else if(arr[mid]<target)
       
        {
       start=mid+1;
;        }
     else {
        end=mid-1;
     }
    }
    return fo;
}
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n= sc.nextInt();
        int target= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     int result=Search(arr,target);
     if(result ==-1)
     System.out.println("digit not found ");
     else
     {
        System.out.println("index is " +result);
     }
    }
}
