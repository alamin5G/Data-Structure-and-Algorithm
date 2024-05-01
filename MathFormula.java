import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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

    public static HashSet<Integer> fourDigitDistincIntegers(int[] digits){
        
        int[] newDigit = Arrays.copyOfRange(digits, 1, digits.length-1);

        // HashSet to store distinct numbers
        HashSet<Integer> distinctNumbers = new HashSet<>();

        // Generate all possible 4-digit numbers
        for (int d1 : newDigit) {
            for (int d2 : digits) {
                if (d2 == d1) continue; // Skip if same digit is repeated
                for (int d3 : digits) {
                    if (d3 == d1 || d3 == d2) continue; // Skip if same digit is repeated
                    for (int d4 : digits) {
                        if (d4 == d1 || d4 == d2 || d4 == d3) continue; // Skip if same digit is repeated
                        // Construct the 4-digit number
                        int number = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
                        // Add to HashSet to ensure uniqueness
                        distinctNumbers.add(number);
                    }
                }
            }
        }

        return distinctNumbers;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();

        int[] digits = {0, 1, 3, 4, 5, 7, 8};

        System.out.println("Sum of First Natural Number from 1 to " + number + " = " + sumOfFirstNaturalNumbers(number));
        System.out.println("Sum of First Natural Even Number from 2 to " + number + " = " + sumOfFirstEvenNumbers(number));
        System.out.println("Sum of First Natural Cube Number from 1 to " + number + " = " + sumOfFirstCubeNumbers(number));
        System.out.println("Total 4 digit Distinct number from "+ Arrays.toString(digits) + " digit number: " );
       
       //distinct numbers
        HashSet<Integer> hashSet = fourDigitDistincIntegers(digits);
        System.out.println(hashSet.size());
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : hashSet) {
            list.add(integer);
        }
        list.sort((a, b) -> a - b);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
