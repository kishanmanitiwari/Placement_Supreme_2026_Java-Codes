public class SortingAlgo {

    public static void main(String[] args) {
        // int arr[] = {12,37,35,6,23,5};
        // bubbleSort(arr);
        // printArray(arr);

        int arr[] = {10,5,2,1};
        selectionSort(arr);
        printArray(arr);
    }

    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length; 
        for(int i=0; i<n-1;i++){ //Passes - n-1 because swap(i+1) and n = n-1 = n
            for(int j=0; j<n-1-i;j++){ // Kaha tak sort // i is indicating total sorted
                //comparison
                if(arr[j]>arr[j+1]){ //compare
                    swap(j,j+1,arr); //swap
                }  
            }
        }
        //loop khatam sab sorted hai
        
    }

    private static void swap(int j, int i, int[] arr) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp; 
    }

    static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1;i++){ //passes number = n-1
            //small elemtn konse index?
            int minIndex = i; // smallest vale -assue

            for(int j=i+1;j<=n-1;j++){ // last element comparison
                //comparsopn for min?
                if(arr[j]<arr[minIndex]){ //har bar min ke compare to find new
                    minIndex = j;
                }
            }
            // System.out.println("Pass Number - "+ i + " Min Element was "+ arr[minIndex]);
            swap(i, minIndex, arr);
            
        }
    }
}

