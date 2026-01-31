// Maximum subarray sum(Kadane's Algorithm)
package Day4_Arrays_Advanced;

import java.util.Scanner;

public class problem_01 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static int maxsubsum1(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }


    static int maxsubsum2(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    static int maxsubsum3(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);

        // brute force approach
        // Time complexity = O(n^3)
        // Space Complexity = O(1)
        int MaxSubArraySum1 = maxsubsum1(arr, n);
        System.out.println("Maximum subarray sum: " + MaxSubArraySum1);

        // better approach-
        // Time complexity = O(n^2)
        // Space Complexity = O(1)
        int MaxSubArraySum2 = maxsubsum2(arr, n);
        System.out.println("Maximum subarray sum: " + MaxSubArraySum2);

        // optimal approach-
        // Time complexity = O(n)
        // Space Complexity = O(1)
        int MaxSubArraySum3 = maxsubsum3(arr, n);
        System.out.println("Maximum subarray sum: " + MaxSubArraySum3);
    }
}
