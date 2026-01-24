// matrix multiplication
package Day5_twoD_Array;

import java.util.Scanner;

public class problem_05 {

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

    static void multiplicationArray(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] ans = new int[r1][c2];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<c1; k++){
                        ans[i][j] += (a[i][k]*b[k][j]);
                    }
                }
            }
        printarr(ans);
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

        multiplicationArray(arr1, m1, n1, arr2, m2, n2);
        sc.close();

    }
}
// time complexity = O(r1 × c2 × c1)
//space complexity = O(r1 × c2)