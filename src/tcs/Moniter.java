package tcs;

import java.util.Scanner;

public class Moniter {

    public static void main(String[] args) {
        // Step 1: Initialize variables
        int n, p, ans = 0, m = Integer.MAX_VALUE;  // m will store the minimum rank
        Scanner sc = new Scanner(System.in);
        
        // Step 2: Read number of ranks (students)
        n = sc.nextInt();
        
        // Step 3: Loop through all the ranks and find the minimums
        for (int i = 0; i < n; i++) {
            p = sc.nextInt();  // Read rank for this student
            if (p < m) {        // Check if current rank is less than the previous minimum
                m = p;          // Update the minimum rank
                ans++;          // Increment the counter for new minimum
            }
        }
        
        // Step 4: Output the result
        System.out.print(ans - 1);  // Subtract 1 to exclude the first rank, which is not a new minimum
        sc.close();
    }
}
