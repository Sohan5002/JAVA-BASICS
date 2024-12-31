package tcs;

import java.util.Scanner;

public class Factorial {

    public static void main (String []args)
    {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=1;
        for (int i=1;i<=num;i++)
       temp =temp*i;
       System.out.print(temp);
       sc.close();
    }
}
/*
 * recursion mwethod
 * int factorial(n)
 * {
 * if(n==0)
{
 return 1;
 }
 return n*factorial(n-1);
}
 main()
 {
 input(n);
 factorial(n);
 }
 * 
 */