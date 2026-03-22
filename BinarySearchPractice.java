import java.util.Arrays;

void main(){
    int arr[] = {1,4,5,2,12,26};
    // binarySearch(arr,12);

    Arrays.binarySearch(arr,12);
}

int binarySearch(int[] arr, int target){
    //1) Arrays should be sorted

    Arrays.sort(arr); // Line

    // sort(v.beign(),v.end());

    //Collection.sort();

    int start = 0, end = arr.length-1;

    while(start<=end){
        int mid = (start+end)/2; //Round Bracket 
        //BODMAS 

        // mid == ans
        //ans > mid
        // ans <mid

        //Present - Always found on the mid

        if(arr[mid]==target){
            return mid;
        }else if(target>arr[mid]){
            start = mid+1;
        }else{
            end = mid-1;
        }

    }

    return -1;
}