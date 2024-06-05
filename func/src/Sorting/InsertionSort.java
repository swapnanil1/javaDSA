package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Array to be sorted
        int[] arr = {7, 8, 3, 1, 2};

        // Call insertionSort function
        insertionSort(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Iterate over the array, starting from the second element
        for (int i = 1; i < n; i++) {
            // Store the current element in a variable key
            int temp = arr[i];

            // Initialize a variable to traverse the sorted subarray
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key element at its correct position in the sorted subarray
            arr[j + 1] = temp;
        }
    }
}
// https://www.youtube.com/watch?v=wWhAhp6PIuQ