<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

import java.util.Scanner;

public class multipleofk {
    public static  void  multiple(int n, int k){
        if(k==1)
        {   System.out.println(n);
            return ;
        }
       multiple(n,k-1);
       System.out.println(  n*k);

       }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();      
            int k = sc.nextInt();
         //int arr[] = new int[n];
             multiple(n,k);
sc.close();
            //System.out.println("The multiple of "+n+" and "+k+" is "+result);
    }

}
