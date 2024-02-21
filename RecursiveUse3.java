public class RecursiveUse3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 9, 3};
        int sum = sumArray(array, 0, array.length - 1);
        System.out.println("Sum of array elements: " + sum);
    }

    // Recursive function to calculate the sum of array elements
    private static int sumArray(int[] arr, int start, int end) {
        // Base case: when the array has only one element
        if (start == end) {
            return arr[start];
        }

        // Recursive case: sum the current element and the sum of the rest of the array
        int mid = (start + end) / 2;
        int leftSum = sumArray(arr, start, mid);
        int rightSum = sumArray(arr, mid + 1, end);

        // Combine the results
        return leftSum + rightSum;
    }
}