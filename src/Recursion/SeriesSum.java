<<<<<<< HEAD
package Recursion;
=======
package recursion;
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a

import java.util.Scanner;

public class SeriesSum {
    public static int Series(int n) 
    { if(n==0)return 0;
        if(n%2==0) return Series(n-1)-n;        
       
        return Series(n-1)+n;
    }
    public static void main(String[] args) {
<<<<<<< HEAD
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            Series(n);  
            System.out.println(Series(n));
        }
=======
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Series(n);  
        System.out.println(Series(n));
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
    }

}
