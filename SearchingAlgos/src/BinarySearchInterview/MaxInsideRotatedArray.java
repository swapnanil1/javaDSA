package BinarySearchInterview;

public class MaxInsideRotatedArray {

    // Function to find the maximum element in a rotated array
    public static int findMaxInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle;
        int pivot = 0;

        // Binary search to find the pivot element
        while (start < end) {
            middle = start + (end - start) / 2;
            if (arr[middle - 1] > arr[middle]) {
                end = middle - 1;
            } else if (arr[middle + 1] > arr[middle]) {
                start = middle + 1;
            } else {
                // WRT Middle, neither the next element is greater nor the previous element is smaller,
                // it means we have found the pivot element (max element) and the next element is the smallest in the array
                pivot = middle;
                break;
            }
        }

        return arr[pivot];
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 0, 1, 2, 3, 4};
        // Call the function to find the maximum element in the rotated array
        int maxElement = findMaxInRotatedArray(arr);
        System.out.println("Max element in the rotated array: " + maxElement);
    }
}
