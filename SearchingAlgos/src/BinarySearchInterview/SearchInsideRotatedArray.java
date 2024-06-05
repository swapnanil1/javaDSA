package BinarySearchInterview;

public class SearchInsideRotatedArray {

    // Function to find the maximum element in a rotated array
    public static int findMaxInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        // Binary search to find the pivot element
        while (start < end) {
            middle = (start + end) / 2;
            if (middle > 0 && arr[middle - 1] > arr[middle]) {
                return middle - 1; // Found the pivot
            } else if (arr[start] <= arr[middle] && arr[middle] > arr[end]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return start; // If the array is not rotated, return 0
    }

    static int searchElementInRotatedArray(int[] arr, int find, int start, int end) {
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == find)
                return middle;

            // If the left part is sorted
            if (arr[start] <= arr[middle]) {
                if (arr[start] <= find && find < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else { // If the right part is sorted
                if (arr[middle] < find && find <= arr[end]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 0, 1, 2, 3, 4};
        // Call the function to find the maximum element in the rotated array
        int maxElementIndex = findMaxInRotatedArray(arr);
        int search = searchElementInRotatedArray(arr, 1, 0, arr.length - 1);
        System.out.println("Max element in the rotated array: " + arr[maxElementIndex]);
        System.out.println("Search element in the rotated array: " + search);
    }
}

/* My broken code which uses 3 loops in a if else format

package BinarySearchInterview;

public class SearchInsideRotatedArray {

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

        return pivot;
    }

    static int searchElementInRotatedArray(int[] arr, int maxElementIndex, int find) {
        int start = 0;
        int end = arr.length - 1;
        int middle = -1;
        if (arr[maxElementIndex] > find) {
            // the find element is on the left side
            end = maxElementIndex;
            while (start < end) {
                // simple binary search of the left side
                middle = start + (end - start) / 2;
                if (arr[middle] > find)
                    end = middle - 1;
                else if (arr[middle] < find)
                    start = middle + 1;
                else {
                    return middle;
                }
            }
        } else if (arr[maxElementIndex] < find) {
            // the find element is on the right side
            start = maxElementIndex;
            while (start < end) {
                // simple binary search of the right side
                middle = start + (end - start) / 2;
                if (arr[middle] > find)
                    end = middle - 1;
                else if (arr[middle] < find)
                    start = middle + 1;
                else {
                    return middle;
                }
            }
        } else {
            // search element at the maxElementIndex
            return maxElementIndex;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 0, 1, 2, 3, 4};
        // Call the function to find the maximum element in the rotated array
        int maxElementIndex = findMaxInRotatedArray(arr);
        int search = searchElementInRotatedArray(arr, maxElementIndex, 1);
        System.out.println("Max element in the rotated array: " + arr[maxElementIndex]);
        System.out.println("Search element in the rotated array: " + search);
    }
}
*/
