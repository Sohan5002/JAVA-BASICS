package tcs;

import java.util.Scanner;

public class Automorphic {
    public static boolean check(int num)
    {
        int product = num*num;
        while (num>0) {
            if(num%10!=product%10){
                return false;
            }
            num = num / 10;        // Remove last digit of num
            product = product / 10;
            
            //return true;
        }
                return true;

    }

    public static void main(String [] name)
    {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

      boolean result=check(num);
      if(result)
      {
        System.out.println("yes");

      }
      else
      {
        System.out.println("no");
      }
      sc.close();
    }
}
