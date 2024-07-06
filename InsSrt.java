import java.util.Arrays;

public class InsSrt {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 9, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Insertion Sort: " + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int low = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > low){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = low;
        }

    }
}
