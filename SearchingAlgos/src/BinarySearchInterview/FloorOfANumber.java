package BinarySearchInterview;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int Ceil = Ceilingof(arr, 15);
        System.out.println("The ceiling is " + Ceil);
    }

    static int Ceilingof(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        if (target < start)
            return arr[start];
        while (start <= end) {
            if (arr[middle] == target) {
                return arr[middle - 1];
            } else if (target > arr[middle]) {
                start = middle + 1;
                middle = (start + end) / 2;
            } else {
                end = middle - 1;
                middle = (start + end) / 2;
            }
        }
        return arr[end];
    }
}
