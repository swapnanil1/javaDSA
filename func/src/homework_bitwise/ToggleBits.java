package homework_bitwise;

import java.util.Scanner;

public class ToggleBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ToggleABitAt(1, 7);
        ToggleABitAt(2, 7);
        ToggleABitAt(3, 7);
    }

    static void ToggleABitAt(int pos, int number) {
        int bitAtPos = 1 << pos;
        if ((number & bitAtPos) > 0) { // apply clear operation
            int bitmask = ~(1 << pos);
            System.out.print("For Number " + number + " Bit At Postion " + pos + " is 1. Toggling to 0 we get:-> " + (bitmask & number));
        } else {
            int bitmask = 1 << pos;
            System.out.print("For Number " + number + " Bit At Postion " + pos + " is 0. Toggling to 1 we get:-> " + (bitmask | number));
        }
    }
}
