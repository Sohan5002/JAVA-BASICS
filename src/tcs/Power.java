package tcs;

import java.util.Scanner;

public class Power {
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int num= sc.nextInt();
        int po=sc.nextInt();
        System.out.print(Math.pow(num, po));
    sc.close();
    }

}
/*
 * for(int i=1;i<=po;i++)
 *   sum = 1*num;
 * 
 */