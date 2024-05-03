import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-(i+1); j++) {
                if (array[j] > array[j+1]) {
                    swap(j, j+1, array);
                }
            }
        }
    }

    private void swap(int position, int position1, int[] array){
                    int temp = array[position];
                    array[position] = array[position1];
                    array[position1] = temp;
    }


    public void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {7,3,6,2,9};
        System.out.println("Before Sorting: ");
        bubbleSort.printArray(arr);
        System.out.println("After Sorting: ");
        bubbleSort.sort(arr);
        bubbleSort.printArray(arr);

    }
}
