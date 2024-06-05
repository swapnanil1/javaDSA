package CyclicSort_Problems;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -2, -1, 1};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 0};
        System.out.println(FindSmallestMissingPositiveNo(arr));
        System.out.println(FindSmallestMissingPositiveNo(arr1));
        System.out.println(FindSmallestMissingPositiveNo(arr2));
    }

    static int FindSmallestMissingPositiveNo(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] != nums[correctIndex] && nums[i] <= len) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        // next loop to find the missing number between the indexes j and j + 1.
        for (int j = 0; j < len; j++) {
            if (nums[j] != j + 1) {
                return j + 1; // Missing positive integer found
            }
        }
        // if the array is all sorted and like 1 2 3 4 5 then the missing positive is element at (end+1)
        return nums[len - 1] + 1;
    }

    static void swap(int[] num, int n1, int n2) {
        int temp = num[n1];
        num[n1] = num[n2];
        num[n2] = temp;
    }
}
