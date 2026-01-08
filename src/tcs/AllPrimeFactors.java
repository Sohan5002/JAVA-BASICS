package tcs;

import java.util.Scanner;

public class AllPrimeFactors {
    /*public static void printfactor(int num)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
             System.out.println(i);
            }
        }
    
        
    }*/
     public static boolean checkprime(int i)

     {
        if(i<2)
         {
            return false;
         }
        for(int m=2 ;m<=Math.sqrt(i);m++)
        {
            if(i%m==0)
            {
                return false;
            }
        }
        return true;
     }
public static void main(String []something)
{
 Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
  //printfactor(num);
  for(int i=1;i<=num;i++)
  {
    if(num%i==0&&checkprime(i))
    {

        System.out.println(i);
    }
  }
  
    sc.close();
}
}