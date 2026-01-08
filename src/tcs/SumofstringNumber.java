package tcs;

import java.util.*;
//import javax.naming.spi.DirStateFactory;

public class SumofstringNumber {
    
     public  static  void Sum (String str)
     {
        int res= 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0'&& str.charAt(i)<='9')
            res+=str.charAt(i)-'0';
        }
        System.out.println(res);
        }
     
     
    
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         String str =  sc.nextLine();
         Sum(str);
      sc.close();


    }
    
}
