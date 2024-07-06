import java.util.Arrays;

public class BblSrt {

    public static void main(String[] args) {
        int[] arr = {9, 7, 1, 4, 2, 5};
        System.out.println("The original Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting with Bubble Sort: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
