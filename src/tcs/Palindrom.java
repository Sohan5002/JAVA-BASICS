package tcs;

import java.util.Scanner;

public class Palindrom {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int rev= 0;
        while (n>0) {


      int j=n%10;
      rev= (rev*10)+j;
       n=n/10; }
       if(m==rev)
    {
       
 System.out.print("Yes");
}
 else
{
    System.out.println("NO");
}     
sc.close();

 }


}
/*
 *  2nd approch by string
 * 
 * package tcs;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String original = Integer.toString(n);
        String reversed = new StringBuilder(original).reverse().toString();
        
        if (original.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}

 */
