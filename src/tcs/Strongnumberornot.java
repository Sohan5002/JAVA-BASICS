package tcs;

import java.util.Scanner;

public class Strongnumberornot {
public static void main(String []name)
{
     Scanner sc = new Scanner( System.in);
     int num= sc.nextInt();
     int temp=num;
     //int result=1;
     int check=0;
     while (num!=0) {
       
        int pre=num%10;
        int result =1;
        for(int i=1;i<=pre;i++)
        {
            result =result*i;
        }
        check +=result;
        num/=10;
    }
     if(check==temp)
       {
           System.out.println("yes it is strong ");

       }
    else {
       System.out.println("it is not strong");
    }
        
       
        
        
     
sc.close();
}
}
