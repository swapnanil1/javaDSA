package BinarySearchInterview;

public class Find_in_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 11, 13, 15, 16, 65, 541, 577, 455, 4, 2, 1};
        int pos = findMountainArr(arr, 15);
        System.out.println(pos);
    }

    // Also MountainArray is still just a program to find the max element in the array using binary search.
    static int findMountainArr(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < arr[middle + 1]) {
                start = middle + 1;
                //ascending slope
            } else {
                end = middle;
            }
            //descending slope as the middle element is either bigger than the next element
        }
        return FindinMoutainArr(start, search, arr);
    }

    static int FindinMoutainArr(int max, int search, int[] arr) {
        int start = 0;
        int end = max;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (search == arr[middle]) {
                return middle;
            } else if (search < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}