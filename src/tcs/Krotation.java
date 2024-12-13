package tcs;

import java.util.Scanner;

public class Krotation { 
	
	private static final char[] RoatedArray = null;
	public static void RoatedArray(int arr[],int k) { 
		int n=arr.length;
		k=k%n;
		{
			reverse(arr,0,n-1);
			reverse(arr,0,k-1);
			reverse(arr,k,n-1);
		}
	}
	private static void  reverse(int arr[], int start,int end)
	{
		int temp =0;
		while(start<end) {
		 temp=arr[start];
		 arr[start]=arr[end];
		 arr[end]=temp;
		  start++;
		  end--;
		}
		
	}
	public static void main (String args[]) {
		 try (Scanner input = new Scanner (System.in)) {
			int n=input.nextInt();
			 int k=input.nextInt();
			 int arr[]=new int[n];
			 for(int i=0; i<n;i++)
			 {
				 arr[i]=input.nextInt();
			 }
			 RoatedArray(arr,k);
			 for (int num : arr) {
		            System.out.print(num + " ");
		        }
			  input.close();
		}
		
	}
 
}
