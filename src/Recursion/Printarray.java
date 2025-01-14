package Recursion;

import java.util.Scanner;

public class Printarray {
    public  static void printArray(int []arr,int index)
    {  //basecase
     if(index==arr.length) return;
     //selfwork
     System.out.print(arr[index]+" ");
     //recursive call
     printArray(arr,index+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index=sc.nextInt();
        int []arr= new int[index];
        for(int i=0;i<index;i++)
        {
            arr[i]=sc.nextInt();
        }
        printArray(arr,0);
    }
}
