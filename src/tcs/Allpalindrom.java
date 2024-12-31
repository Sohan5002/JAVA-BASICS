package tcs;

import java.util.Scanner;



public class Allpalindrom { 
    
   /*  staticboolean        
{
    int temp=i;
    int rev=0;
    while (i>0)

{
   rev =rev*10+temp%10;
    if(temp==i)

    return temp;
    else


}*/
    
    public static void main(String []args)
     {
        try (Scanner sc = new Scanner(System.in)) {
            int start =sc.nextInt();
            int end =sc.nextInt();
            for(int  i= start;i<=end;i++)
            {
                String orignal=Integer.toString(i);
                String reversed = new StringBuilder(orignal).reverse().toString();
                if(reversed.equals(orignal))
                    
                {
                    System.out.println((reversed)+" ");
                }
            }       }
    } 
  /*canner  input = new Scanner(System.in);
   int min= input.nextInt();
   int max= input.nextInt();
   for(int i=min;i<=max;i++)

   int reverse(i);

*/
}
