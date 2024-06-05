import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        int[] array = new int[limit];
        // input
        for(int i = 0;i<limit;i++){
            array[i] = in.nextInt();
        }
        System.out.println("Enter Element to search");
        int Search = in.nextInt();
        //Search
        for(int i = 1;i<array.length;i++){
            if (array[i] == Search)
                System.out.println(Search+" Found at "+ i+"th index");
        }
    }

}
