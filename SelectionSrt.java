import java.util.Arrays;

class SelectionSrt{

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionsrt(arr);
        System.out.println("After sorting with Selection Sort: " + Arrays.toString(arr));
    }

    public static void selectionsrt(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
           for (int j = i+1; j < arr.length; j++) {
            if(arr[min] > arr[j]){
                min = j;
            }
           }

           BubbleSrt.swap(arr, i, min);
        }
    }
}