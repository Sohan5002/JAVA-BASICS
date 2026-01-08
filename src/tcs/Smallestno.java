package tcs;

import java.util.Scanner;

public class Smallestno {
	
	public static int smallest(int arr[])
	{
		int temp= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>temp) {
				temp=arr[i];
			}
			
	
		}
		return temp;	
	}
	
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int []arr =new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		 
		
		int smallestNumber=smallest(arr);
		 System.out.println(smallestNumber);
		sc.close(); 
	}

}
