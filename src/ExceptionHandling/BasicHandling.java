package ExceptionHandling;

import java.util.Scanner;

  class  Main {
    
    public  static void  main(String []args) {
        try (Scanner sc = new Scanner(System.in)) {
            
         
            System.out.println("Enter the  number: ");
            int num = sc.nextInt();
            System.out.println("Enter the divisor: ");
            int div = sc.nextInt();
            try {
                int result = num / div;
                System.out.println("Result :" + result);
            }
            catch ( Exception e) {
                System.out.print("Exception are occurred");
            }
        }
    }
        }