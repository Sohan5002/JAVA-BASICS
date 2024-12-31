package tcs;

import java.util.Scanner;

public class Replaceall0with1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans=0;
        int temp =1;
        
        while(num>0){
        int d=num%10;
       
        
          if(d==0)
    {
           d=1;
           //ans= temp*d+ans;
    }
    ans= temp*d+ans;
        temp=temp*10;
      num /=10;
}
        
System.err.println(ans);
sc.close();
    
    }
    }


