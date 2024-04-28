import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] arr) {
        
        int maxVal = Arrays.stream(arr).max().orElse(0);
        int[] count = new int[maxVal + 1];

        // Count occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Build the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 234, 23, 234, 23, 123, 123, 123, 1, 12, 23, 232, 1, 2, 2, 3, 45, 6, 6, 54, 2 };
        int[] sortedArr = countingSort(array);

        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}