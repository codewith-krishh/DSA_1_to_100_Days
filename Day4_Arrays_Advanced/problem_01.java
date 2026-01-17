// Maximum subarray sum
package Day4_Arrays_Advanced;

import java.util.Scanner;

public class problem_01 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
// brute force approach-
// Time complexity = O(n^2)
// Space Complexity = O(n) [or = O(1) if array is given]