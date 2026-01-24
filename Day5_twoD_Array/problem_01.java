// Matrix traversal

package Day5_twoD_Array;

import java.util.Scanner;

public class problem_01 {

    static void printarr(int[][] arr, int row, int colm){
        System.out.println("Array is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<colm; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printarr(arr, m, n);
        sc.close();
    }
}
// time complexiy = O(m*n)
// space complexity = O(m*n)