package recursion;

import java.util.Scanner;

public class Maxnum {
    public static int max(int[]arr,int index)
{    //base case
    if(index==arr.length-1){
    return arr[index];}
    //recursive call
    //self work
    return Math.max(arr[index],max(arr,index+1));

}    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index=sc.nextInt();
        int []arr= new int[index];
        for(int i=0;i<index;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=max(arr,0);
        System.out.println(result);
        sc.close();
    }

}
