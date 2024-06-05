package CyclicSort_Problems;

public class MissingNumberProblem {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        int[] arr1 = {0, 5, 2, 4, 1};
        int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(MissingNumberIn(arr));
        System.out.println(MissingNumberIn(arr1));
        System.out.println(MissingNumberIn(arr2));
    }

    public static int MissingNumberIn(int[] arr) {
        int i = 0;
        int len = arr.length;
        while (i < len) {
            // sorting
            int index = arr[i];
            if (arr[i] < len && arr[i] != arr[index]) {
                swap(arr, i, index);
            } else {
                i++;
            }
        }
        // find missing number
        for (int j = 0; j < len; j++) {
            if (j != arr[j]) {
                return j;
            }
        }
        // if the element missing is equal to the length of the array.
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// https://leetcode.com/problems/missing-number/description/
