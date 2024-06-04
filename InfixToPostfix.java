import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    // Function to return precedence of operators
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    // Function to convert infix expression to postfix expression
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
<<<<<<< HEAD
            }else if(c == '('){
                operator.push(c);
            }else if(c == ')'){
                while(!operator.isEmpty() && operator.peek() != '('){
                    postfix.append(operator.pop());
=======
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and output from the stack until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
>>>>>>> 14a8d609abd1456bc24924646cbf1d659b12ff38
                }
                stack.pop(); // Remove '(' from stack
            }
            // An operator is encountered
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

<<<<<<< HEAD
        while(!operator.isEmpty()){
            postfix.append(operator.pop());
=======
        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
>>>>>>> 14a8d609abd1456bc24924646cbf1d659b12ff38
        }

        return postfix.toString();
    }

<<<<<<< HEAD
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
=======
    // Helper function to check if a character is an operator
    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        String postfix = infixToPostfix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
>>>>>>> 14a8d609abd1456bc24924646cbf1d659b12ff38
    }
}
