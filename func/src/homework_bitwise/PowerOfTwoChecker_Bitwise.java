package homework_bitwise;

public class PowerOfTwoChecker_Bitwise {
    public static void main(String[] args) {
        int number = 2; // Change this to test different numbers
        boolean result = isPowerOfTwo(number);

        if (result) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
/*The function isPowerOfTwo takes an integer n as input and returns true if it is a power of 2, otherwise false.
If a number is a power of 2, it will have only one bit set to 1 in its binary representation. For example, 8 in binary is 1000, and 16 in binary is 10000.
By subtracting 1 from a power of 2, you get a number where all the bits to the right of the only set bit are flipped. For example, 8 - 1 = 7 (which is 0111 in binary), and 16 - 1 = 15 (which is 1111 in binary).
Performing a bitwise AND operation between a power of 2 and its predecessor (i.e., n & (n - 1)) will result in 0 if n is a power of 2 because all bits will be canceled out except the set bit.
So, if (n & (n - 1)) equals 0, then n is a power of 2.
*/