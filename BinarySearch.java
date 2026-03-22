public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,40,50,80,90,100};

        int ans = binarySearch(arr,100);

        System.out.println(ans);
    }

    // Binary Search Function
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; // mid

            if (arr[mid] == target) {
                return mid; // Found the target
            }
            if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
       
       
        return -1; // Target not found
    }
}
