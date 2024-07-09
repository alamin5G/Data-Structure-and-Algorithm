
import java.util.Arrays;

public class MrgSrt {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After Merge Sort: " + Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = low + (high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1; //lower bound
        int n2 = high - mid; //upper bound
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[low+i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0; 
        int k= low;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        while(i < n1){
            arr[k++] = L[i++];
        }

        while(j < n2){
            arr[k++] = R[j++];
        }

    }
}
