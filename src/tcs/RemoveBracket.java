package tcs;

import java.util.Scanner;

public class RemoveBracket 



{



   public static void   bracket(String str)
   {
    String result ="";
    for(int i =0; i<str.length();i++){
    if(str.charAt(i)!=')' && str.charAt(i)!='(')
    {
     result +=str.charAt(i);
    
    }
    //System.out.println(result);
    }
    System.out.println(result);
   } 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str =  sc.nextLine();
        bracket(str);

    }
}
