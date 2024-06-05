package BinarySearchInterview;

public class FindFirstAndLastPostion {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 7, 7, 8, 8, 10};
        int firstOccurrence = findFirstOccurrence(nums, 7);
        int lastOccurrence = findLastOccurrence(nums, 7);

        System.out.println("First Occurrence at " + firstOccurrence);
        System.out.println("Last Occurrence at " + lastOccurrence);
    }

    static int findFirstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int firstOccurrence = -1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target == nums[middle]) {
                firstOccurrence = middle;
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return firstOccurrence;
    }

    static int findLastOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int lastOccurrence = -1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target == nums[middle]) {
                lastOccurrence = middle;
                start = middle + 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return lastOccurrence;
    }
}
