import java.util.*;

void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

void takeArrayInput(int arr[],Scanner scn){
      for(int i=0;i<arr.length;i++){
        IO.print("Enter value for index "+ i +" ");
        arr[i] = scn.nextInt();
    }
}


void main(){
    // int goldCoint1 = 1;
    // int goldCoint2 = 2;
    // int goldCoint3 = 3;
    // int goldCoint4 = 4;
    // int goldCoint5 = 5;

    // //Array create
    // int arr[] = new int[5]; // declared arr = [0,0,0,0,0]
    
    // //Array Value Insert

    // arr[0] = 1;
    // arr[2] = 2;
    // arr[1] = 3;

    // //length of array

    // int n = arr.length; //5

    // //Print
    // for(int index =0; index<n;index++){
    //     System.out.println(arr[index]);
    // }

    // // Second Way

  
  



    // int coins[]; //Declaration
    // coins = new int[10]; //Initialisation

    // //int coins[] = new int[10]; //Int+ dec

    // int arr2[] = {1,2,3,4,5}; // Array Declare + Value Initialsed


    // arr2[2] = 10;
    // arr2[0] = 5;

    //   for(int i=0;i<arr2.length;i++){
    //     System.out.println(arr[i]);
    // }

    IO.println("Enter ths size of array :");
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();
    int userArray[] = new int[size];

    takeArrayInput(userArray, scn);

    printArray(userArray);

    int maxElement = maxArray(userArray);

    IO.println("The max element is " + maxElement);




}

int maxArray(int arr[]){
    int ans = -1;

    for(int index=0;index<arr.length;index++){
        int curr = arr[index];

        if(curr > ans){
            ans = curr;
        }


    }

    return ans;
}