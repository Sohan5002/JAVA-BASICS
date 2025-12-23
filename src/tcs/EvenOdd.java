package tcs;

import java.util.Scanner;

public class EvenOdd { 
     public static boolean check(int num)
     {
        if(num%2==0)
        {
            return true;
        }
        else{
            return false;
        }
     }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result= check(num);
  
      if(result)
      {
        System.out.println("It is Even");

      }  
    else{
        System.out.println("It is odd");
    }
   sc.close();
    }

}
