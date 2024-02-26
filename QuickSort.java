import java.util.Arrays;
public class QuickSort {
    public static int count = 0;
    public static int opt = 0;
    public static void main(String[] args) {
        int[] array = {9, 5, 0, 11, 17, 8, 23, 3, 14, 6, 29, 42, 10, 7, 16, 31, 2, 19, 4, 13, 
            37, 22, 1, 28, 12, 35, 46, 18, 27, 15, 20, 33, 49, 21, 26, 39, 54, 24, 
            30, 50, 44, 38, 58, 45, 56, 32, 41, 55, 68, 40, 36, 63, 51, 48, 73, 75, 
            65, 59, 52, 71, 66, 60, 70, 82, 64, 77, 95, 80, 67, 88, 93, 79, 85, 89, 
            84, 98, 91, 72, 87, 76, 78, 96, 81, 99, 97, 92, 86, 94, 90, 83, 74, 69};
        System.out.println("Original Array: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array  : " + Arrays.toString(array));
        
        System.out.println("swapped: " + count);
        System.out.println("operation: " + opt );

    }
    // QuickSort algorithm
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);
            // Recursively sort the left and right sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    // Partitioning step
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                if (i == j) {
                    continue;
                }
                opt++;
                swap(array, i, j);
                
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }
    // Utility method to swap elements in an array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        count++;
    }
}
