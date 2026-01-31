// Transpose of matrix
package Day05_twoD_Array;

import java.util.Scanner;

public class problem_03 {

    static void inputArray(int[][] arr, Scanner sc){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printarr(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int[][] transpose, int[][] arr){
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[i].length; j++){
                transpose[i][j] = arr[j][i];
            }
        }
    }

    static void inplaceTranspose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements: ");
        inputArray(arr, sc);
        System.out.println("Array is: ");
        printarr(arr);

        //if matrix is not square matrix
        // time complexity = O(m*n)
        //space complexity = O(m*n)
        int[][] res = new int[n][m];
        transposeMatrix(res, arr);
        System.out.println("Tranpose matrix is: ");
        printarr(res);

        //if matrix is square matrix 
        // time complexity = O(m^2)
        // space complexity = O(1)
        if(m==n){
            inplaceTranspose(arr);
            System.out.println("Tranpose matrix is: ");
            printarr(arr);
        }
        else{
            System.out.println("It;s not a valid square matrix");
        }
    }
}
