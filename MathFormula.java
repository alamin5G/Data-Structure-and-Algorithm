import java.util.Scanner;

public class MathFormula {

    //Calculate the sum of first N natural numbers 
    //1, 2, 3, 4 = 10;
    public static int sumOfFirstNaturalNumbers(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }

    //calculate the sum of first N even numbers;
    //2, 4, 6, 8 = 20; where n=4;
    public static int sumOfFirstEvenNumbers(int n){
        n = n*(n+1);
        return n;
    }

    //calculate the sum of first N natural cube numbers;
    //1^3, 2^3, 3^3, 4^3 = 100;
    public static int sumOfFirstCubeNumbers(int n){
        n = (n*n*(n+1)*(n+1))/4;
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();
        System.out.println("Sum of First Natural Number from 1 to " + number + " = " + sumOfFirstNaturalNumbers(number));
        System.out.println("Sum of First Natural Even Number from 2 to " + number + " = " + sumOfFirstEvenNumbers(number));
        System.out.println("Sum of First Natural Cube Number from 1 to " + number + " = " + sumOfFirstCubeNumbers(number));
    }
}
