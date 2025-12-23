package SortingAlgo.selectionsort;

import java.util.Scanner;

public class searching {
    public static void Selectionsort(int []arr){
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            int minindex=i;
            for(int j=0;j<n;j++){
              if(arr[j]<arr[minindex]){
                  minindex=j;
                }
            }
              int temp=arr[minindex];
                arr[minindex]=arr[i];
                arr[i]=temp;

        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int arr[]=new int [n];  
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }   
            Selectionsort(arr);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
