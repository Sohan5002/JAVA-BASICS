package tcs;

import java.util.*;

public class Maximumproduct {
	public  static int Product(int arr[])
	{
		int n= arr.length;
		int pre=1;
		int suffx=1;
		int ans= Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(pre==0)pre=1;
			if(suffx==0)suffx=1;
			pre*=arr[i];
			suffx*=arr[n-i-1];
			ans=Math.max(ans, Math.max(pre, suffx));
			
		}
		return ans;
	}
	
	  public static void main (String args[])
	  {
		  Scanner sc = new Scanner (System.in); {
			  int n= sc.nextInt();
			  int[] arr= new int[n];
			  for(int i = 0;i<n;i++) {
				 arr[i]=sc.nextInt();
			
			 }
		     int Result= Product(arr);
		     System.out.println(Result);
		  
		  }
		  sc.close();
		  }

}
