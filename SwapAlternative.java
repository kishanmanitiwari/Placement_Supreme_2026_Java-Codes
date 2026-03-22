// makefile
// Copy code
// Input:  [1, 2, 3, 4, 5, 6]
// Output: [2, 1, 4, 3, 6, 5]

public class SwapAlternative {

    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6};
        // swapPair(arr);
    }

    private static void swapPair(int[] arr) {
        for(int i=0; i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[0] = arr[i+1];
            arr[i+1] = temp;
            
        }
    }

    public int missingNumber(int[] nums) {
        
    }

}