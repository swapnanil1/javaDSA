public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,11,14,20,36,48};
        int foundAtIndex=BinarySearch(arr,100);
        System.out.println("The Element is at "+foundAtIndex);
    }

    static int BinarySearch(int[] arr, int search) {
        int length = arr.length;
        int middle = length/2;
        int start = 0;
        int end = length -1;
        while(start<=end){
            //baseCase
            if (arr[middle] == search)
                return middle;
            else if (search > arr[middle]) {
                start = middle+1;
                middle = (start+end)/2;
            }
            else{
                end = middle -1;
                middle = (start+end)/2;
            }
        }
        return -1;
    }
}
