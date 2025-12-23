<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

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
<<<<<<< HEAD
        try (Scanner sc = new Scanner(System.in)) {
            int index=sc.nextInt();
            int []arr= new int[index];
            for(int i=0;i<index;i++)
            {
                arr[i]=sc.nextInt();
            }
            printArray(arr,0);
        }
=======
        Scanner sc = new Scanner(System.in);
        int index=sc.nextInt();
        int []arr= new int[index];
        for(int i=0;i<index;i++)
        {
            arr[i]=sc.nextInt();
        }
        printArray(arr,0);
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
    }
}
