package BinarySearchInterview;

public class MountainArray {
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // left or right can be returned as peak, as they converge to the peak
        return arr[left];
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 10, 8, 6, 4, 2};
        System.out.println("Peak in the mountain array: " + findPeak(arr));
    }
}

