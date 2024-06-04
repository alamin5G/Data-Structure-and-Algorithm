import java.util.Scanner;
import java.util.Stack;

/**
 * The class InfixToPrefix is convert infix expressions to prefix expressions in Java.
 */

public class InfixToPrefix {
    
    public static String infixToPrefix(String s){
        StringBuilder rev = new StringBuilder(s);
        String reverse = rev.reverse().toString();
        StringBuilder infix = new StringBuilder();
        Stack<Character> stack = new Stack<>();


        for(Character c : reverse.toCharArray()){

            if(Character.isLetterOrDigit(c)){
                infix.append(c);
            }else if(c == '('){
                stack.push(c);
            }else if(!stack.isEmpty() && c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    infix.append(stack.pop());
                }
                stack.pop(); //deleting the ( from stack
            }else if(isOperator(c)){
                if(!stack.isEmpty() && precedence(stack.peek()) > precedence(c) )
                {
                    infix.append(stack.pop());
                }else{
                    stack.push(c);
                }
                
            }
        }

        while(!stack.isEmpty()){
            infix.append(stack.pop());
        }

        return infix.reverse().toString();
    }
    

    /**
     * The function `precedence` returns the precedence level of a given operator character in an arithmetic expression.
     * 
     * @param c The parameter `c` is a `Character` type representing an operator character such as '+', '-', '*', '/', or '^'.
     * @return The method `precedence` takes a `Character` as input and returns an `int` value based on the precedence of the operator represented by the character. 
     * The return value is determined using a switch statement.
     */
    private static int precedence(Character c){
       
        return switch(c){
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }

    /**
     * The function checks if a given character is an operator (+, -, *, /, ^) and returns true if it is.
     * 
     * @param c The `isOperator` method checks if a given character is an operator. The operators it checks for are `+`, `-`, `*`, `/`, and `^`.
     * @return The method is returning a boolean value indicating whether the input character is an operator (+, -, *, /, or ^).
     */
    private static boolean  isOperator(Character c){

        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    


    public static void main(String[] args) {
        System.out.print("Enter an infix string: ");
        Scanner input = new Scanner(System.in);
        String infix = input.nextLine();
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix : " + prefix);
    }

}
