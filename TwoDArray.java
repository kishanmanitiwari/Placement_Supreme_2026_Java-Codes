import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main1(String[] args) {
        //Create
        int[][] matrix = new int[3][3];
        int[][] matrix2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(matrix2[1][1]); 

        //Value / Modify
        matrix[0][1] = 10;
        //Print - Index
        System.out.println(matrix[0][1]);
    }

    void print2dArray(int[][] arr){
        int ROW = arr.length;
        int COL = arr[0].length;
        for(int i=0; i<ROW;i++){
            for(int j=0; j<COL;j++){
               System.out.print(arr[i][j]+" ");
               
            }
            System.out.println();
        }
    }

    void main3(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows and col -");
        int ROW = scn.nextInt();
        int COL = scn.nextInt();
        int[][] matrix = new int[ROW][COL];

        for(int i=0; i<ROW;i++){
            for(int j=0; j<COL;j++){
                System.out.println("Enter value for "+i+" "+j);
                matrix[i][j] = scn.nextInt();
            }
        }
        
        print2dArray(matrix);

        scn.close();
    }

    int maxIn2dArray(int[][] matrix){
        int ROW = matrix.length;
        int COL = matrix[0].length;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<ROW;i++){
            for(int j=0;j<COL;j++){
                int currVal = matrix[i][j];
                maxi = Math.max(currVal,maxi);
            }
        }

        return maxi;
    }

    int[][] transposeMatrix(int[][] matrix){
        int ROW = matrix.length;
        int COL = matrix[0].length;
        int[][] transpose = new int[ROW][COL];

        for(int i=0; i<ROW;i++){
            for(int j=0;j<COL;j++){
               transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }

    void main(){
        int[][] matrix = {
            {1,54,7},
            {4,66,16},
            {99,27,33}
        };

        System.out.println("The orignial Arrays is  -");
        print2dArray(matrix);

        int[][] transpose = transposeMatrix(matrix);


        // System.out.println("The Transpose Arrays is  -");
        // print2dArray(transpose);

        for (int[] col : transpose) {
            System.out.println(Arrays.toString(col));
        }

        // for (int[] col : transpose) {
        //     for (int val: col) {
        //         System.out.println(val);
        //     }
        // }



    }

}
