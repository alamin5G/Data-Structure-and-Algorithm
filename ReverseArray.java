import java.util.Arrays;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 2, 8, 3};
        System.out.println("Before reverse: " + Arrays.toString(arr));
        int[] revArray = reverseArray(arr, 0, arr.length-1);
        System.out.println("After reverse: " + Arrays.toString(revArray));


    }

    public static int[] reverseArray(int[] arr, int start, int end){

        int[] revArray = new int[arr.length];
        while (start<end) {
            int temp = arr[start];
            revArray[start] = arr[end];
            revArray[end] = temp;
            start++;
            end--;
        }

        return revArray;

    }
}