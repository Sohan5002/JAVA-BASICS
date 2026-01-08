package tcs;

import java.util.Scanner;

public class Addtwofraction {

    public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
           int num1=sc.nextInt();
           int num2=sc.nextInt();
           int dec1= sc.nextInt();
           int dec2=sc.nextInt();
           int nn= (dec2*num1)+(dec1*num2);
           int dd = dec1*dec2;
           System.err.println(nn+"/"+dd);
         sc.close();
        }
}
