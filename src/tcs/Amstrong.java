package tcs;

import java.util.Scanner;

public class Amstrong {

    public static boolean check(int num)
    {
   int m= num;
   int sum=0;
   int count= String.valueOf(num).length();
  while (num!=0)
  {
    int digit = num%10;
      sum +=Math.pow(digit ,count);
      num/=10;
      if(sum==m){
        return true;
      } 
  }
     return false;
}

 public static void main (String [] args)
 {
    Scanner sc = new Scanner (System.in);
    {
        int num=sc.nextInt();
        boolean result = check(num);
        if(result){
        System.out.print("Yes");
        }
        else{
            System.out.println("not");
        }
    }
    sc.close();
 }
}
