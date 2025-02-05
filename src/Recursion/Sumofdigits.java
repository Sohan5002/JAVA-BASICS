package recursion;

import java.util.Scanner;

public class Sumofdigits {
    public static int Sum(int num,int[] count)
    {  
        if(num >= 0 && num <= 9)
        {count[0]++;
         return num;
        
        }   
        count[0]++;
        return Sum(num / 10,count) + num % 10;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] count={0};
       int result=  Sum(num,count);
     
       System.out.println("Sum of digits of "+num+" is "+result);
     System.out.println("Number of digits in "+num+" is "+count[0]);   
       sc.close();
    }
    
}
