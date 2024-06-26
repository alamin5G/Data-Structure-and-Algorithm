public class BinarySearch {
    /*
     * 
     * 
https://www.coursera.org/learn/algorithms-searching-sorting-indexing/home/week/1 (8HRs)
https://www.coursera.org/learn/dynamic-programming-greedy-algorithms/home/week/1 (13HRs)
https://www.coursera.org/learn/trees-graphs-basics/home/week/1 (9HRs)
https://www.coursera.org/learn/mathematics-for-computer-science/home/week/1 (9HRs)
https://www.coursera.org/learn/cs-fundamentals-2/home/week/1 (3HRs)
     */
    public static void main(String[] args) {
        int[] arr ={1, 2, 4, 8, 9, 12, 45, 55, 86, 101, 340, 341, 355,500};
        int target = 501;
        int retunred = myBinarySearch(arr, target);

        if (retunred>-1) {
            System.out.println("The searching position is : " + retunred);
        }else{
            System.out.println("The element is not founded!");
        }

        //matrix implementation
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

        boolean found = matrixSearch(matrix, 4, 5, 15);
        System.out.println("Matrix target value return status is : " + found);
    }


    private static int myBinarySearch(int[] arr, int target) {
        int high = arr.length-1;
        int low = 0;
        int mid;

        while (low<=high) {
            mid = (low+high)/2;

            if (target==arr[mid]) {
                return mid;
            }else if (target < arr[mid]) {
                high = mid -1;
            }else if(target > arr[mid]) {
                low = mid + 1;
            }
        }
        

        return -1;
    }

    private static boolean matrixSearch(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    
	    int low = 0; 
	    int high = m*n-1;
	    
	    if(n != 0 && m != 0){
	        while(low <= high){
	            int mid = (low+high) >> 1;
	            int value = matrix[mid/m][mid%m];
	            if(value == x){
	                return true;
	            }else if(x < value){
	                high = mid -1;
	            }else if(x > value){
	                low = mid+1;
	            }
	        }
	    }
	    
	    return false;
	} 

   
}
