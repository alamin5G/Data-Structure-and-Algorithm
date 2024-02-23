import java.util.Scanner;

public class RecursiveUse9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your fibonacci digit: ");
        int n  = input.nextInt();
        System.out.println("Fibonacci Series up to " + n + " numbers:");
      
        loopRecursion(0, n);
    }

    public static void loopRecursion(int i, int n){
        if (i >= n) {
            return;
        }
        System.out.println("fibonacci " + i + " = " + fibonacci(i));
        loopRecursion(i+1, n);

    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } 
        int last = fibonacci(n-1);
        int las2 = fibonacci(n-2);

        return last + las2;
    }
}