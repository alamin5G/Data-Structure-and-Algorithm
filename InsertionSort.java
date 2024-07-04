import java.util.Arrays;

class InsertionSort{
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3};
        System.out.println("Original Array : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Selection Sort: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > min){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = min;
            
        }
    }
}