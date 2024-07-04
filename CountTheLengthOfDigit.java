import java.util.Scanner;

public class CountTheLengthOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any length of digit: ");
        int a = input.nextInt();
        int len = (int) Math.floor(Math.log(a)+1);
        System.out.println("the length of the digit is : " + len);
    }
}
