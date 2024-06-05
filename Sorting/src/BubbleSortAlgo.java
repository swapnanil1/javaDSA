import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] sorted = BinarySearch(arr);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] BinarySearch(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
