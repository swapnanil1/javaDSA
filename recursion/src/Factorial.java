public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change the number to calculate its factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    static long calculateFactorial(int n){
        if(n==1 || n==0)
            return 1;
        else
            return n*calculateFactorial(n-1);
    }
}