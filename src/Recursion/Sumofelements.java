package Recursion;

import java.util.Scanner;

public class Sumofelements {
    public  static int sum(int [] arr,int index)    
    {
        //base case
        if(index==arr.length-1)return  arr[index];
   //recursive call
      //int smallans=sum(arr,index+1);
      return arr[index]+sum(arr,index+1);
        }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int index=sc.nextInt();
            int []arr= new int[index];
            for(int i=0;i<index;i++)
            {
                arr[i]=sc.nextInt();
            }
            int result=sum(arr,0);
            System.out.println(result);
        }
    }
}
