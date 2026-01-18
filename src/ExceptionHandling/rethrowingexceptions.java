package ExceptionHandling;

import java.util.Scanner;

public class rethrowingexceptions {
     public  static  void main (String [] args) {
         System.out.println("Main method execution started");
     try {
         divide();

     }
     catch (Exception e)   {
         System.out.println("Exception is handled in main method");

     }
     System.out.println("Main method execution completed");
     }
     static void  divide()  throws  Exception{
         try {
            Scanner sc = new Scanner( System.in);
            System.out.println("Enter numerator");
            int a = sc.nextInt();
            System.out.println("Enter denominator");
            int b = sc.nextInt();
            int result = a/b;
           System.out.println(result);
         }

         catch (Exception e) {
             System.out.println("Exception is handled in divide method");
             throw  e;
         }
         finally {
              System.out.println("Divisor completed");
         }
     }
}
