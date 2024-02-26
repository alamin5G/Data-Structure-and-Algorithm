import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 9, 0, 4, 3, 2, 8};
        System.out.println("Before quick sort: " + Arrays.toString(arr) );
        quickSort(arr, 0, arr.length-1);
        System.out.println("after quick sort: " + Arrays.toString(arr) );

    }

    public static void quickSort(int[] arr, int low, int high){

        if (low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j = low; j<high; j++){
            if (arr[j] < pivot) {
                i++;
                if (i == j) {
                    continue;
                }
                swap(arr, i, j);
            }

        }
        swap(arr, i+1, high);

        return i + 1;
    }

    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
