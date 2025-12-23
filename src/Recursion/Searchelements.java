package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Searchelements {
    public static ArrayList<Integer> Searchele(int[] arr, int index,int target)
    {
        //basecase
        //if(arr[index]==arr.length) return ;
        if(index>=arr.length) return new ArrayList<Integer>();

        //selfwork
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(arr[index]==target) {
            System.out.print(index +1 +" ");
            result.add(index + 1);
        }
        //recursive
        ArrayList<Integer> smallAns = Searchele(arr, index + 1,target);
        result.addAll(smallAns);
        return result;
    }

  /*----------------------------------------------------------------------------------------------------------- 
   Return all indeces if  x exists in the array. Code.
  public static void  Searchele(int[] arr, int index,int target)
    {
        //basecase
        //if(arr[index]==arr.length) return ;
        if(index>=arr.length) return ;

        //selfwork
        if(arr[index]==target) {
        System.out.print(index +1 +" ");}
        //recursive
         Searchele(arr, index + 1,target);
        
        //int small = Searchele(arr,target, index + 1);

    }*/

    /*--------------------------------------------------------------------------------------------------------------------
    Return index if  x exists in the array. Otherwise return -1.
    public static int   Searchele(int[] arr, int index,int target)
    {
        //basecase
        //if(arr[index]==arr.length) return ;
        if(index>=arr.length) return -1 ;
        //selfwork
        if(arr[index]==target) {
        return  index+1;}
        //recursive5
        return Searchele(arr, index + 1,target);
        
        //int small = Searchele(arr,target, index + 1);

    }*/
    /* -----------------------------------------------------------------------------------------------------------------------
     : Print whether x exists in the array or not.

    public static boolean  Searchele(int[] arr, int index,int target)
    {
        //basecase
        //if(arr[index]==arr.length) return ;
        if(index>=arr.length) return false;
        //selfwork
        if(arr[index]==target) {
        return  true;}
        //recursive
        return Searchele(arr, index + 1,target);
        
        //int small = Searchele(arr,target, index + 1);

    }
        */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index=sc.nextInt();
        int target=sc.nextInt();
        int[] arr = new int[index];
        for(int i=0;i<index;i++)
        {
            arr[i]=sc.nextInt();
        }
       ArrayList<Integer> result= Searchele(arr,0,target);
   // boolean result= Searchele(arr,0,target);
  // int result= Searchele(arr,0,target);
        /*if(result)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");    

        }*/
        System.out.println();
        for(Integer i:result)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
