import java.util.Arrays;

/**
 * MoveAllZerosLast
 */
public class MoveAllZerosLast {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 23, 0, 0, 2, 3, 0};
        System.out.println("Before moving Zeros: ");
        System.out.println(Arrays.toString(arr));
        movingAllZeorsToTheEnd(arr, arr.length);
        System.out.println("After moving Zeros: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void movingAllZeorsToTheEnd(int[] arr, int n){
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0) {
                j++;
            }
        }
    }
}