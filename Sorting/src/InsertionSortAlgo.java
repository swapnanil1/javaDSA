import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        // 4,3,1,2,5 i =0
        // 3,4,1,2,5 i = 1
        // 1,3,4,2,5 i = 2
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }

    static int[] InsertionSort(int[] arr) {
        int len = arr.length - 1;
        for (int i = 0; i <= len - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                } else
                    break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
