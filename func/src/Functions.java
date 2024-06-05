import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = in.nextInt();
        FibonacciUpto(num);
    }
    public static void Factorial(int data){
        int fac=1;
        for (int i = 1;i<=data;i++){
            fac = fac*i;
        }
        System.out.println("The Factorial of "+data+" is "+fac);
    }
    public static void FibonacciUpto(int limit){
        int last = 0;
        int next = 1;
        int fibo = 0;
        int temp = 0;
        System.out.print(last+" "+next+" ");
        while (fibo<=limit){
            fibo = last+next;
            System.out.print(fibo+" ");
            temp = next;
            next = fibo;
            last = temp;
        }    }
}
