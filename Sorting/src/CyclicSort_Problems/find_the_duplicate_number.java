package CyclicSort_Problems;

public class find_the_duplicate_number {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(findDuplicateIn(arr));
    }

    static int findDuplicateIn(int[] nums) {
        // sorting in cycle
        int len = nums.length;
        int i = 0;
        while (i < len) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        return nums[len - 1];
    }

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
