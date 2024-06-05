public class opsAndBinary {
    public static void main(String[] args) {
        preOps();
        postOps();
        relationalOps();
        logicalOps();
    }

    static void logicalOps() {
        int a = 1, b = 0;
        // && !! !
        System.out.println();
    }

    static void postOps() {
        int a = 10;
        int b = 0;
        b = a--;
        System.out.println(a);
        System.out.println(b);
    }

    static void preOps() {
        int a = 10;
        int b = 0;
        b = --a; //guess the value
        System.out.println(a);
        System.out.println(b);
    }

    static void relationalOps() {
        int a = 10;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
    }
}
