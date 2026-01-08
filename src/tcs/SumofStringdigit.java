package tcs;

import java.util.*;
//import javax.naming.spi.DirStateFactory;

public class SumofStringdigit {
    
     public  static  void Sum (String str)
     {
        int res= 0;
        int num =0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
                num=num*10+(str.charAt(i)-'0');
            }
            else
            {
                res+=num;
                num=0;
            }
        }
        res+=num;
                System.out.println(res);
        }
     
     
    
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         String str =  sc.nextLine();
         Sum(str);
      sc.close();


    }
    
}
