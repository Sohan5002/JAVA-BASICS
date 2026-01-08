package tcs;

import java.util.Scanner;

public class PostiveNegative {
    public static boolean check(float num)
    {
        if(num>0)
        {
            return true;
        }
        return false;
    }
 public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in);
      float num=sc.nextFloat();
     boolean result=check(num);
     if(result)
     {
        System.out.println("Positive");

     }
     else
     {
    System.out.println("Negative");

     }
   sc.close();

 }
}
