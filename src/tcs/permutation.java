 package tcs;

import java.util.*;


public class permutation {
    static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
          ans *= i;
        }
        return ans;
      }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n= sc.nextInt();
        int r=sc.nextInt();
        
        int num = fact(n);
        int den = fact(n - r);
        System.out.print(num / den);
        sc.close();
 //System.out.println(result);
}
}
