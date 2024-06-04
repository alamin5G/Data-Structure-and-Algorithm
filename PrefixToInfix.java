import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {

    public static String prefixToInfix(String s){
        String st = new StringBuilder(s).reverse().toString();
        Stack<String> stack = new Stack<>();
        for(Character c : st.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }else if(isOperator(c)){

                String newSt = "(" + stack.pop() + String.valueOf(c) + stack.pop() + ")";
                stack.push(newSt);
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(Character c){
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static void main(String[] args) {
        System.out.print("Enter prefix notation: ");
        Scanner input = new Scanner(System.in);
        String prefix = input.nextLine();
        String infix = prefixToInfix(prefix);

        System.out.println("Prefix to infix : " + infix);
    }
}
