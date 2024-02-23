import java.util.Scanner;

/**
 * RecursiveUse5 - print the sum of n numbers from 1;
 */
public class RecursiveUse5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your n number: ");
        int n = input.nextInt();
        function(n, 0);
    }

    public static int function(int i, int sum){
        if (i < 1) {
            System.out.println(sum);
            return 0;
        }
        function(i-1, sum+i);
        return 0;
    }

}