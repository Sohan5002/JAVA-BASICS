package tcs;

import java.util.Scanner;

public class Gratestthree {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(Math.max(num1,Math.max(num2, num3)));
     sc.close();
    }

}
