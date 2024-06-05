public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {86, 37, 63, 74, 93, 13, 49};
        int foundAtIndex = LinearSearch(arr, 13);
        System.out.println("Found element at " + foundAtIndex);
    }

    static int LinearSearch(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < end; i++) {
            if (arr[i] == search)
                return i;
        }
        return -1;
    }
}