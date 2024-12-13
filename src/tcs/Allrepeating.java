package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Allrepeating {
	
	 public static void Allelements(int arr[])
	 {
		 Arrays.sort(arr);
		 int n=arr.length;
		 for(int i=0;i<n-1;i++)
		 {
			 if(arr[i]==arr[i+1]) {
		   System.out.print(arr[i]+" ");
			 }
		 }
	    
	
			 System.out.print("not found");
		 
	 }
   public static void main(String []args)	
   {
	   Scanner sc =new Scanner (System.in);
	   int num= sc.nextInt();
	   int arr[]= new int[num];
	   for(int i=0;i<num;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   Allelements(arr);
	   sc.close();
   }

}
