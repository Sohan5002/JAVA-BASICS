package SortingAlgo.Insertionsort;

import java.util.*;

public class FindMAx {

class Result {

    public static int findMaximumScore(List<Integer> stockPrices, int k) {
        int maxScore = 0;
        int n = stockPrices.size();

        // Try all possible subsequences
        for (int i = 0; i <= n - k; i++) { // Sliding window of length (n-k)
            int currentScore = 1;
            int tempMaxScore = 1;

            for (int j = i + 1; j < i + n - k; j++) { // From the current window
                if (Objects.equals(stockPrices.get(j), stockPrices.get(j - 1))) {
                    currentScore++;
                } else {
                    currentScore = 1;
                }
                tempMaxScore = Math.max(tempMaxScore, currentScore);
            }
            maxScore = Math.max(maxScore, tempMaxScore);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        List<Integer> stockPrices = Arrays.asList(1, 1, 2, 1, 2, 1);
        int k = 3;

        int result = findMaximumScore(stockPrices, k);
        System.out.println("k-Consistency Score: " + result); // Expected output: 4
    }
}
}
