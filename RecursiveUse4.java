import java.util.Scanner;

public class RecursiveUse4 {
    
    public static void main(String[] args) {
        //print n to n times;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your N size: ");
        int n = input.nextInt();
        int i = 1; //as we have to run our program n times reverse way 3, 2, 1;
        // and the condition is we have to increase i+1
        //so, we initially set the value of i=1;
        function(i, n);

    }

    public static int function(int i, int n){
        if (i >  n) {
            return 0;
        }

        function(i+1, n);

        System.err.println(i);

        return  0;
    }
}
