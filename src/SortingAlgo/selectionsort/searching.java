<<<<<<< HEAD
package SortingAlgo.selectionsort;
=======
package SortingAlgo.selectionsort.searching;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

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
<<<<<<< HEAD
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
=======
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int [n];  
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        Selectionsort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
        }
    }
}
