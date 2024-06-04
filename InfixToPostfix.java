import java.util.Scanner;
import java.util.Stack;

/**
 * The class InfixToPostfix is likely intended to convert infix expressions to postfix notation in Java.
 */
public class InfixToPostfix {

    public static String infixToPostfix(String s){
        Stack<Character> operator = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (Character c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                postfix.append(c);
            }else if(c == '('){
                operator.push(c);
            }else if(c == ')'){
                while(!operator.isEmpty() && operator.peek() != '('){
                    postfix.append(operator.pop());
                }
                operator.pop();
            }else if(isOperator(c)){
                if(!operator.isEmpty() && precedence(operator.peek()) >= precedence(c)){
                    postfix.append(operator.pop());
                }
                operator.push(c);
            }
        }

        while(!operator.isEmpty()){
            postfix.append(operator.pop());
        }

        return postfix.toString();
    }

    private static int precedence(Character c){
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }


    private static  boolean isOperator(Character c) {
       
        return c == '+' || c == '-' || c == '*'  || c == '/' || c == '^';
    }


    public static void main(String[] args) {
        System.out.print("Enter infix string: ");
        Scanner input = new Scanner(System.in);
        String infix = input.nextLine();
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: "+postfix);
    }
    
}
