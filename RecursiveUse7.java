/**
 * RecursiveUse7
 */
public class RecursiveUse7 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6};
        functionss(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static int functionss(int[] arr, int left, int right){
        if (left >= right) {
            return 1;
        }

        swap(arr, left, right);

        return functionss(arr, left+1, right-1);
    }

    public static void swap(int[] arr, int left, int right){
        int t = arr[left];
        arr[left] = arr[right];
        arr[right] = t;
    }
}