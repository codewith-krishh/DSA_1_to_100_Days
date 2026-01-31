// Diagonal sum
package Day5_twoD_Array;

import java.util.Scanner;

public class problem_04 {

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

    static int diagonalSum1(int[][] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    static int diagonalSum2(int[][] arr){
        int sum = 0;
        int limit = Math.min(arr.length, arr[0].length);
        for(int i=0; i<limit; i++){
            sum += arr[i][i];
        }
        return sum;
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

        // brute force approach
        // time complexity = O(m*n)
        // space complexity = O(1)
        int sum1 = diagonalSum1(arr);
        System.out.println("Sum of diagonals is: " +sum1);

        // optimal approach
        // time complexity = O(min(m,n))
        // space complexity = O(1)
        int sum2 = diagonalSum2(arr);
        System.out.println("Sum of diagonals is: " +sum2);
    }
}
