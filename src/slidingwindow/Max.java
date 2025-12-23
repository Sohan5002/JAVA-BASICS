package slidingwindow;

public class Max {
    public static int maxSumOfSubarray(int[] arr, int k) {
        int n = arr.length;

        // Check if the array length is smaller than k
        if (n < k) {
            System.out.println("Array size is smaller than k");
            return -1;
        }

        int maxSum = 0;
        
        // Calculate the initial sum of the first k elements
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int windowSum = maxSum;
        
        // Slide the window from index k to n
        for (int i = k; i < n; i++) {
            // Update the window sum by removing the element at the start of the previous window
            // and adding the new element
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of " + k + "-size subarray: " + maxSumOfSubarray(arr, k));
    }
}
