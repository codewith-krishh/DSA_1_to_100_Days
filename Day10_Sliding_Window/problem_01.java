// Maximum sum subarray of size K

package Day10_Sliding_Window;
import java.util.Scanner;

public class problem_01 {


    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static int subarraySum1(int[] arr, int k){
        if (k > arr.length || k <= 0) return -1;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<=n-k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }


    static int subarraySum2(int[] arr, int k){
        if (k > arr.length || k <= 0) return -1;
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }

        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<=n-k; i++){
            int sum = prefixSum[k+i-1] - prefixSum[i - 1];
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }


    static int subarraySum3(int[] arr, int k){
        if (k > arr.length || k <= 0) return -1;
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }
        int maxsum = windowSum;
        for(int i=k; i<arr.length; i++){
            windowSum += arr[i] - arr[i-k];
            maxsum = Math.max(maxsum, windowSum);
        }
        return maxsum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of subarray: ");
        int k = sc.nextInt();
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);


        // brute force approach
        // time complexity = O(n*k)
        // space complexity = O(1)
        int maxSum1 = subarraySum1(arr, k);
        System.out.println("Maximum sum subarray of size K is: " +maxSum1);


        // better approach
        // time complexity = O(n)
        // space complexity = O(n)
        int maxSum2 = subarraySum2(arr, k);
        System.out.println("Maximum sum subarray of size K is: " +maxSum2);


        // optimal approach
        // time complexity = O(n)
        // space complexity = O(1)
        int maxSum3 = subarraySum3(arr, k);
        System.out.println("Maximum sum subarray of size K is: " +maxSum3);

        sc.close();
    }
}
