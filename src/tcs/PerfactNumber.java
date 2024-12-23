package tcs;

import java.util.Scanner;

public class PerfactNumber {

      public static boolean check (int num)
      {
        int sum =0;
        for(int i=1; i<num-1;i++)
        {
            if((num/i)==0)
            sum+=i;

        }
        if(sum==num)
        {
            return true;

        }
         return false;
        

      }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = check(num);
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
