public class RecursiveUse1 {
    public static void main(String[] args) {
        System.out.println("CountDown Started: ");
        countDown(100);
        System.out.println("\n");
        System.out.println("Timer Started: ");
        timer(1);
    }

    public static void countDown(int i){
        if (i == 0) {
            return;
        }
        System.out.print(" " + i);
        countDown(i-1);
    }

    public static void timer(int i){
        if (i != 101) {
            System.out.print( " " + i);
            timer(i+1);
        }

        return;
    }
}
