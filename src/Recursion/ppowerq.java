package Recursion;

import java.util.Scanner;

public class ppowerq {
    public static int pow(int p,int q)
    {
       if(q==0)return 1;
       return pow(p,q-1)*p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();  
        int q = sc.nextInt();
         int result =pow(p,q); 
         System.out.println("Result is "+result);
  sc.close();
    
    }
}
