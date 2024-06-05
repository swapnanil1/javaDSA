package BinarySearchInterview;

public class CeilingOfALetter {
    public static void main(String[] args) {
        char[] ch = {'c', 'f', 'j'};
        char ceil = CeilingLetter(ch, 'f');
        System.out.println(ceil);
    }

    static char CeilingLetter(char[] ch, char ceilof) {
        int start = 0;
        int end = ch.length - 1;
        int middle;

        while (start <= end) {
            middle = start + (end - start) / 2; // Better way to calculate middle index
            if (ch[middle] == ceilof) {
                if (middle + 1 < ch.length) // Check if ceiling exists
                    return ch[middle + 1];
                else
                    return ch[0]; // Wrap around to the beginning
            } else if (ch[middle] < ceilof) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        // If the loop terminates, it means ceilof is not found
        if (start < ch.length) // Check if start index is within bounds
            return ch[start]; // Return the character at start index
        else
            return ch[0]; // Wrap around to the beginning
    }
}
