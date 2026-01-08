package tcs;

import java.util.Scanner;

public class Findminmaxofdiggit { 
    public static  void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("prnit the number");
       /*  int num = sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
         //int temp=0;
         int d;

         while (num!=0) {
       d=num%10;
       //temp = temp*10+d;
      
        min = Math.min(d, min);
        max= Math.max(d, max);
        num=num/10;
         }
         System.out.println("max value of the number"+ max);
         System.out.println("min value of the number"+ min);
         
         sc.close();
    } */
   String numstr= sc.nextLine();
   char min ='9';
   char max = '0';
   for(char ch : numstr.toCharArray())
{
    if(Character.isDigit(ch))
    {
        min =(char)Math.min(min,ch);
        max = (char)Math.max(max,ch);
    }
}
    System.out.println("Max digit in the number: " + (max - '0'));
    System.out.println("Min digit in the number: " + (min - '0'));

sc.close();
}
}