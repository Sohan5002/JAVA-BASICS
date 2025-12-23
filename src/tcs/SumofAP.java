package tcs;

import java.util.Scanner;

public class SumofAP {
    public static void result(int firstTerm, int commonDiff, int numberOfTerms) {
        int sum = 0;
        
        // Loop through each term in the AP
        for (int i = 0; i < numberOfTerms; i++) {
        // for(int i= firstTerm;i<commonDiff*numberOfTerms-1;i+=commonDiff)   { 
         sum += firstTerm;  // Add current term to sum
            firstTerm += commonDiff;  // Move to the next term
        }
        
        // Output the sum of the AP
        System.out.println(sum);
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
=======
        Scanner sc = New Scanner(System.in);
>>>>>>> 1ba83dc36bd7175be6a2bcb739686c83094c052a
        
        // Input number of terms, common difference, and first term
        int numberOfTerms = sc.nextInt();
        int commonDiff = sc.nextInt();
        int firstTerm = sc.nextInt();
        
        // Call result method to calculate the sum of the AP
        result(firstTerm, commonDiff, numberOfTerms);
        
        sc.close(); // Close the scanner
    }
}
/*  using formula 
 * 
 * sum = (n/2.0)*(2.0*a+(n-1)*d);
 * 
 * 
 * for(int i=1;i<2)
 */