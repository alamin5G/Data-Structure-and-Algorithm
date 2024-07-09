import java.util.Arrays;

public class QuickSrt {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 8, 2, 1, 5, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("After quick sort: " + Arrays.toString(arr));

    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high ){

        int i = low-1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if(arr[j]<=pivot){
                i++;
                if(i==j) continue;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);
        return i+1;
    }
}
