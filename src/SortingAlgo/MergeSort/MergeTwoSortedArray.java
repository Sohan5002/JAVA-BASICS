package SortingAlgo.MergeSort;

import java.util.Scanner;

 public class MergeTwoSortedArray {

    public static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        left = mergesort(left);
        right = mergesort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k++] = left[i++];
            } else {
                mix[k++] = right[j++];
            }
        }

        while (i < left.length) {
            mix[k++] = left[i++];
        }

        while (j < right.length) {
            mix[k++] = right[j++];
        }

        return mix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sorted = mergesort(arr);

        System.out.println("Sorted Array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
