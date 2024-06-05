import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rows And Columns");
        int rows = in.nextInt();
        int cols = in.nextInt();
        // Use comments to run specific functions
        int[][] array1 = create2dArr(rows, cols);
//        print2dArr(array1);
        search2dArr(array1);
    }

    static void search2dArr(int[][] array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter element to search");
        int key = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key)
                    System.out.println("Found " + key + " at " + "row " + (i + 1) + " column " + (j + 1));
            }

        }
    }

    static void print2dArr(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }

    static int[][] create2dArr(int rows, int cols) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //  System.out.print(i + "X" + j + "=");
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;

    }
}
