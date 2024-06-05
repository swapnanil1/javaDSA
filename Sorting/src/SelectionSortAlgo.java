import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        int select = 0;
        int end = arr.length - 1;
        for (int i = 0; i <= end; i++) {
            int max = 0;
            for (int j = 0; j <= end - i; j++) {
                //finding the max element
                if (arr[j] >= max) {
                    max = arr[j];
                    select = j;
                }
            }
            // swapping the max element with the element at the end
            int temp = arr[end - i];
            arr[end - i] = max;
            arr[select] = temp;
        }
        return arr;
    }
}
