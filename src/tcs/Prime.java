package tcs;

import java.util.Scanner;

public class Prime {
     public static boolean prime(int i){

   /*  {
         int temp=0;
         for(int m=1;m<=i;m++){
         if(i%2==0)
         {
         temp=temp+1;
         }
        }
         if(temp==2)
         {
            return true;

         }
         else
         {
            return false;
         }

    }*/
   // int temp=0;
    if(i<2){
        return false;
    }
    for(int  n=2;n<=Math.sqrt(i);)
    {
        if(i%n==0)
     {
        return false;
     }   
    
    return true;
    }
        return false;
}
     
 public static void main(String [] args)
{
    Scanner sc =new Scanner(System.in);
    int num =sc.nextInt();
    //for(int i=1;i<num;i++)
 boolean m = prime(num); 
      if(m){
     System.out.println("Yes");
      }
     else
    {
        System.out.println("No");
    }

sc.close();
}

}