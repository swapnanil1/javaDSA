package Sorting;

import java.util.Arrays;

public class BubbleShot {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            // OuterLoop traversal goes till array length and next time reduce to array length -1 until zero
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // innerLoop traverse around the unsorted area and leaves the sorted area alone(max values reach at end)
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
