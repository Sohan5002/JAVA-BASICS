package Recursion;

import java.util.Scanner;

public class SeriesSum {
    public static int Series(int n) 
    { if(n==0)return 0;
        if(n%2==0) return Series(n-1)-n;        
       
        return Series(n-1)+n;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            Series(n);  
            System.out.println(Series(n));
        }
    }

}
