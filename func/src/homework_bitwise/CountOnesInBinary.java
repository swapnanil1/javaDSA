package homework_bitwise;

public class CountOnesInBinary {
    public static void main(String[] args) {
        int number = 5; // Change this to test different numbers
        int count = countOnes(number);
        System.out.println("Number of 1's in binary representation of " + number + ": " + count);
    }

    public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // If the last bit is 1, increment count
            n = n >>> 1; // Updating the n itself thereby reducing to untill zero . Shift the number to the right by 1 (unsigned right shift)
        }
        return count;
    }
}
