package tcs;

import java.util.*;

public class Nonrepating {

    public static List<Integer> Allelements(int arr[]) {
        // Initialize the HashMap to store frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Count the frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1); // Use getOrDefault to handle null
        }
        
        // Step 2: Find all elements with frequency 1
        List<Integer> nonRepeating = new ArrayList<>();
        for (int num : arr) {
            if (map.get(num) == 1) { // Check if the frequency is 1
                nonRepeating.add(num);
            }
        }
        
        return nonRepeating;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.println("Enter the number of elements:");
        int num = sc.nextInt();
        
        // Initialize array and input elements
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Get the list of non-repeating elements
        List<Integer> result = Allelements(arr);
        System.out.println("Non-repeating elements: " + result);

        sc.close();
    }
}
