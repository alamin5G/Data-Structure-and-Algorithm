import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
    public static String postfixToInfix(String s){
        Stack<String> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }else if(isOperator(c)){
                String top = stack.pop();
                String topNext = stack.pop();

                String newSt = "(" + topNext + String.valueOf(c) + top + ")";
               
                stack.push(newSt);
            }
        }



        return stack.pop();
    }


    private static boolean isOperator(Character c){
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static void main(String[] args) {
        System.out.print("Enter posfix notation: ");
        Scanner input = new Scanner(System.in);
        String postfix = input.nextLine();
        String infix = postfixToInfix(postfix);
        System.out.println("Postfix to infix: " + infix);
    }
}
