import java.util.Arrays;

@SuppressWarnings("unused")
public class ArrayPatternPratice {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr) {
        // Reverse in-place
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
    }

    static void moveZeroToEnd(int[] arr) {
        int n = arr.length;
        int j = 0; // Track the first non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // non zero element
                swap(arr, i, j);
                j++;
            }
        }
    }

    static void printAllSubArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // start
            for (int j = i; j < n; j++) { // end
                for (int k = i; k <= j; k++) { // range
                    System.out.print(arr[k]);
                }

                System.out.println();
            }
        }
    }

    static int kadensAlgo(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int currSum = 0;

        for (int val : arr) {
            currSum += val;

            maxi = Math.max(currSum, maxi); // Adding that am I profit or loss

            if (currSum < 0)
                currSum = 0; // -ve Burden
        }

        return maxi;
    }

    static int majorityELement(int[] arr) {
        int candidate = -1;
        int votes = 0;

        for (int i : arr) {
            if (votes == 0) {
                candidate = i;
                votes = 1;
            } else {

                if (i == candidate) {
                    votes++;
                } else {
                    votes--;
                }
            }
        }

        return candidate;

    }

    static void sort012(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0, k = n - 1;

        while (j <= k) { // tracing 0th pos
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 1) { // tracing 1st(middle)
                // middle
                j++;
            } else {
                swap(arr, j, k); // tracing end pos
                k--;
            }
        }
    }

    static int sumArraySizeK(int[] arr, int k){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int windowSum =0;
        int i = 0;
        for(;i<k;i++){
            windowSum+=arr[i];
        }
        maxi = Math.max(windowSum,maxi);

        for(;i<n;i++){
            windowSum -= arr[i-k]; //first Value Remove
            windowSum+=arr[i];
            maxi = Math.max(windowSum,maxi);
        }

        return maxi;
    }

    static int searchPivot(int arr[]){
        int n = arr.length;
        int low =0, int end = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>end){ 
                low = m+1; //right side
            }else{
                end = mid-1;
            }
        }

        return low;
    }

    static int findInRotatedArray(int arr[], int target){
        int pivot = searchPivot(arr);
        int n = arr.length;

        if (target>arr[pivot] && target<arr[n-1]) {
               //second 
               Arrays.binarySearch(arr,pivot,n,target);
        }else{
            //first part
            Arrays.binarySearch(arr,0,pivot,target);
        } 
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 0, 2, 1, 1, 0 };
        // sort012(nums);
        // System.out.println(Arrays.toString(nums));
        int[] arr = {2,1,5,1,3,2};
        System.out.println(sumArraySizeK(arr,3));

    }

    public static void main1(String[] args) {
        // int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // reverseArray(arr);
        // moveZeroToEnd(arr);
        // System.out.println(Arrays.toString(arr));
        // printAllSubArrays(arr);
        // System.out.println(kadensAlgo(arr));
    }
}