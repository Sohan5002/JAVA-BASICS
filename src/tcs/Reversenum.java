package tcs;

import java.util.Scanner;

public class Reversenum {

   
    public static void main(String []args)
{
    Scanner sc = new Scanner( System.in);
     int num =sc.nextInt();
     //String str = String.valueOf(num);
     int temp=0;
    int d;
     while (num!=0) {
         d=num%10;
        temp=temp*10+d;
        num=num/10;

     }
     System.out.println(temp);
     sc.close();
}
    }
