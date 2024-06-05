public class Palindrome {
    public static void main(String[] args) {
        String t = "AbAba";
        System.out.println(isPalindrome(t));
    }

    static boolean isPalindrome(String t) {
        t = t.toLowerCase();
        int len = t.length();
        for (int i = 0; i < len/2; i++) {
            if(t.charAt(i)!=t.charAt(len-i-1))
                return false;
        }
        return true;
    }
}
