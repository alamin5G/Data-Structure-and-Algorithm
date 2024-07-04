
import java.util.Scanner;

public class Add2NumbersUsingXor {
    //it's a basic operation
    public static void main(String[] args) {
        System.out.println("enter 2 decimal number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        String aa = Integer.toString(a, 2);

        if(aa&1 == 1 && b&1 == 1){
            
        }
    }
}
