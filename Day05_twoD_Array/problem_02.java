// Matrix addition

package Day05_twoD_Array;

import java.util.Scanner;

public class problem_02 {

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

    static void arrayAddition(int[][] addition, int[][] arr1, int[][] arr2){
        for(int i=0; i<addition.length; i++){
            for(int j=0; j<addition[i].length; j++){
                addition[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of 1st array: ");
        int m1 = sc.nextInt();
        System.out.print("Enter number of columns 1st array: ");
        int n1 = sc.nextInt();
        int[][] arr1 = new int[m1][n1];
        System.out.println("Enter the elements of 1st array: ");
        inputArray(arr1, sc);
        System.out.println("Array is: ");
        printarr(arr1);

        System.out.print("Enter number of rows of 2nd array: ");
        int m2 = sc.nextInt();
        System.out.print("Enter number of columns 2nd array: ");
        int n2 = sc.nextInt();
        int[][] arr2 = new int[m2][n2];
        System.out.println("Enter the elements of 2nd array: ");
        inputArray(arr2, sc);
        System.out.println("Array is: ");
        printarr(arr2);

        if(m1 != m2 || n1 != n2){
            System.out.println("Enter valid input arrays!");
        }
        else{
            int[][] addition = new int[m1][n1];
            arrayAddition(addition, arr1, arr2);
            System.out.println("The resultant array is: ");
            printarr(addition);
        }

        sc.close();
    }
}
// time complexity = O(m*n)
//space complexity = O(m*n)