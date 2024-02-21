public class SelectionSort {
    
    public static void main(String[] args) {
        int[] arr = {1,5, 9, 2, 0, 16, 58, 13, 39, 17};
        System.out.print("Before Sorted: (Unsorted):");
        for (int i : arr) {
            System.out.print(" " + i);
        }

        System.out.println();
        System.out.print("After sorted: (selection sort - smallest to large) :");
        int[] sorted = selectionSort(arr);
        for (int i : sorted) {
            System.out.print(" " + i);
        }

    }

    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if ( arr[j] < arr[i] ) { //arr[i] is larger than the current arr[j] postion
                    int larger = arr[i]; 
                    arr[i] = arr[j]; //smallest item placed into the iTH postion
                    arr[j] = larger; //larger item placed into the current jTH position
                }
            }
        }

        
        return arr;
    }
}
