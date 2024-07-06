import java.util.Arrays;

public class CntSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5, 1, 0, 2, 5, 3, 3, 1, 9, 15, 18};
        System.out.println("Original Array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("After Counting Sort: " + Arrays.toString(arr));
            
    }

    public static void countingSort(int[] arr){

        int maxValue = findMax(arr);
        int[] tempArray = new int[maxValue+1];

        //initialize with zeros
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = 0;
        }

        //count the frequencies
        for(int num : arr){
            tempArray[num]++;
        }
        // for (int i = 0; i < tempArray.length; i++) {
        //     tempArray[arr[i]]++;
        // }

        //update the value into the main array;
        int index = 0;
        for (int i = 0; i < tempArray.length; i++) {
            
            while(tempArray[i] > 0){
                arr[index] = i;
                index++;
                tempArray[i]--;
            }
        }
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(max < num){
                max = num;
            }
        }

        return max;
    }
}
