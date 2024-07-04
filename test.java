public class test {
    public static void main (String[] args)
	{
        int[] arr = {5, 9, 2, 4, 1, 8, 7, 14, 5, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println("position - " + i);
                    break;
                }
            }
            System.out.println("inner loop execution complete");
        }


        
    }
}