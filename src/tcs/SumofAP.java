package tcs;

import java.util.Scanner;

public class SumofAP {
    public static void result(int firstTerm, int commonDiff, int numberOfTerms) {
        int sum = 0;
        
        // Loop through each term in the AP
        for (int i = 0; i < numberOfTerms; i++) {
            sum += firstTerm;  // Add current term to sum
            firstTerm += commonDiff;  // Move to the next term
        }
        
        // Output the sum of the AP
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
 */