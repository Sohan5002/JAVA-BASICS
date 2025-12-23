package tcs;

import java.util.Scanner;

public class SUmofNaturalmo {

    public static void sum(int num)
    {
        int temp=0;
        int i=1;
        while (i<=num) {
            
        
       // for(int i=1;i<=num;i++){
            temp= temp+i;
           i++;
            
        }
        System.out.println(temp);
        
        


    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        sum(num);
     
  sc.close();
    }

}
