import java.util.Arrays;

public class BubbleSrt {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3, 8};
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting with Bubble Sort Algorithm: " + Arrays.toString(arr) );
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swaped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    swaped = true;
                    swap(arr, j, j+1);
                }
            }

            if(!swaped){
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
