import java.util.Arrays;

public class SelectionSort {
    
    private static int count = 0;
    public static void main(String[] args) {
        int[] arr = {
            100, 99, 98, 97, 96, 95, 94, 93, 92, 91,
            90, 89, 88, 87, 86, 85, 84, 83, 82, 81,
            80, 79, 78, 77, 76, 75, 74, 73, 72, 71,
            70, 69, 68, 67, 66, 65, 64, 63, 62, 61,
            60, 59, 58, 57, 56, 55, 54, 53, 52, 51,
            50, 49, 48, 47, 46, 45, 44, 43, 42, 41,
            40, 39, 38, 37, 36, 35, 34, 33, 32, 31,
            30, 29, 28, 27, 26, 25, 24, 23, 22, 21,
            20, 19, 18, 17, 16, 15, 14, 13, 12, 11,
            10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
        };
        System.out.print("Before Sorted: (Unsorted): "+ Arrays.toString(arr));
        

        System.out.println();
        int[] sorted = selectionSort(arr);
        System.out.println("After sorted: (selection sort - smallest to large) : "+ Arrays.toString(sorted));
        
        
        System.out.println(count);

    }

    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if ( arr[j] < arr[i] ) { //arr[i] is larger than the current arr[j] postion
                    int larger = arr[i]; 
                    arr[i] = arr[j]; //smallest item placed into the iTH postion
                    arr[j] = larger; //larger item placed into the current jTH position
                    count++;
                }
            }
        }
        return arr;
    }
}
