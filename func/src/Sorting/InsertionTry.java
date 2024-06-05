package Sorting;

import java.util.Arrays;

public class InsertionTry {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        InsertSort(arr);
    }

    static void InsertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            // swap with the original value
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
