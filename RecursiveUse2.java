import java.util.Scanner;

public class RecursiveUse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your factorial digit: ");
        long factoNum = input.nextLong();
        System.out.println("Sum of Factorial " + factoNum + " is : " + factorial(factoNum));
    }

    private static long factorial(long i) {
        if (i == 1) {
            return i;
        }

        return i * factorial(i-1);
    }
}
