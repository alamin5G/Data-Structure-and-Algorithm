import java.util.Scanner;

public class Recursiveuse6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your n number: ");
        int n = input.nextInt();
        System.out.println(function(n));
    }

    public static int function(int n){
        
        if (n == 0) {
            return n;
        }
        return n + function(n-1);
    }
}