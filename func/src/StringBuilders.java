public class StringBuilders {
    public static void main(String[] args) {
        writeStringBuilder();
        StringRev("Hello");
    }

    static void writeStringBuilder() {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // setCharAt index
        sb.setCharAt(0, 'R');
        System.out.println(sb);
        // insertCharAt
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(3, "nn");
        System.out.println(sb);
        // delete
        sb.delete(4, 6);
        System.out.println(sb);
        // append
        sb.append(" Goat");
        System.out.println(sb);
        // replace
        sb.replace(0, 2, "");
        sb.insert(0, 'T');
        System.out.println(sb);
        // GetLength
        System.out.println(sb.length());
        // Reverse
        System.out.println(sb.reverse());
    }

    static void StringRev(String rev) {
        StringBuilder sb = new StringBuilder(rev);
        int length = rev.length();
        for (int i = 0; i < length / 2; i++) {
            int front = i;
            int end = length - i - 1; // Adjusted end index
            char frontChar = sb.charAt(front);
            char endChar = sb.charAt(end);
            sb.setCharAt(front, endChar);
            sb.setCharAt(end, frontChar);
        }
        System.out.println(sb);
    }
}
