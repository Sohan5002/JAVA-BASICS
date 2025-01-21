package SortingAlgo.margeesort;

import java.util.Scanner;


public class Arrange {
    public static void display()
    public static void Merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
          L[i]=arr[l+1];
        }
        for(int j=0;j<n2;j++)
        {
            R[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1&&j<n2)
        {
            if(L[i]<R[j])
            arr[k++]=L[i++];
        }
        while(j<n2)

        {
            arr[k++]=R[j++];
        }
    }
    public static void Search(int []arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            Search(arr,l,mid);
            Search(arr,mid+1,r);
            Merge(arr,l,mid,r);
        }
    }
    public static void  main (String[]args)
{
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int [n];  
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }   
    Search(arr,0,n-1);
    
}
}
