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
                while(!operator.isEmpty() && operator.peek() != ')'){
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



        return null;
    }

    private static int precedence(Character c){
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 3;
        };
    }


    private static  boolean isOperator(Character c) {
       
        return c == '+' || c == '-' || c == '*'  || c == '/';
    }


    public static void main(String[] args) {
        
    }
    
}
