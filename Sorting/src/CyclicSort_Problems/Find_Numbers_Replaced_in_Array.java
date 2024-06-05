package CyclicSort_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Numbers_Replaced_in_Array {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(new List[]{findDuplicates(arr)}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        // Cyclic Sorting
        int i = 0;
        while (i < len) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // print the missing
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < len; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
