import java.util.Arrays;

public class CyclicSortAlgo {
    public static void main(String[] args) {
        //  int[] arr = {4, 2, 1, 3, 5};
        int[] arr = {3, 4, -2, -1, 1};
        System.out.println(Arrays.toString(CyclicSort(arr)));
    }

    static int[] CyclicSort(int[] arr) {
        int number = 0;
        int index = 0;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            index = arr[i] - 1;
            if (arr[index] != arr[i]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
