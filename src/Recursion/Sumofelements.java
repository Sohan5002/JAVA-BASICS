<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

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
<<<<<<< HEAD
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
=======
        Scanner sc = new Scanner(System.in);
        int index=sc.nextInt();
        int []arr= new int[index];
        for(int i=0;i<index;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=sum(arr,0);
        System.out.println(result);
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
    }
}
