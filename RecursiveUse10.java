import java.util.Arrays;

public class RecursiveUse10 {
    public static void main(String[] args) {
        
        int n = 5; // Sample input
        int[] arr = {7, 12, 1, 20};
        int[] result = nextGreaterElement(arr, n);
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int[] newArr = new int[n];
        int currentElement = arr[0];
        for (int i = 0; i < n; i++) {
           for (int j = i+1; j < n; j++) {
                if(arr[i]<arr[j]){
                    newArr[i] = arr[j];
                    break;
                }
           }
           if(newArr[i]>-1){
               continue;
           }else{
               newArr[i] = -1;
           }

        }

        return newArr;
    }
}