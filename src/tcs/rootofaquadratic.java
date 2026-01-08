package tcs;

import java.util.Scanner;

public class rootofaquadratic {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= ((b*b)-(4*a*c));
        if(d==0){
            System.out.println("Root are real and different ");
        }
        else if (d>0) {
         System.out.println("root are real and different");
            
        }
        else{
            System.out.println("the root are complex and different");        }
    sc.close();
        }

}
