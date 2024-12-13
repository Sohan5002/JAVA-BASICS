package tcs;

import java.util.Scanner;

public class Replaceduplicate {  
	
	 public static int Remove(int [] arr)
	 {
		 int i=0;
		 for(int j=0;j<arr.length;j++)
		 {
			 if(arr[i]!=arr[j])
			 {
				i++;
				arr[i]= arr[j];
			 }
		 }
			 return i+1;
		 
	
		
		
	 }
	public static void main(String args[])
	{   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int[] arr= new int[n];
	   for( int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
		 int k= Remove(arr);
		 for(int  m=0; m<k; m++)
	   System.out.print(arr[m]+" ");
	sc.close(); 
	}
	

}
