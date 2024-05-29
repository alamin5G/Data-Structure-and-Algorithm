import java.util.Arrays;

public class test {
    public static void main (String[] args)
	{
        int[] arr = {5, 9, 2, 4, 1, 8, 7, 14};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
        
    }
}