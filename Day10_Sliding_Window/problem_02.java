// Longest subarray with sum ≤ K
package Day10_Sliding_Window;

import java.util.Scanner;

public class problem_02 {


    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static int longest_subarray1(int[] arr, int k, int len){
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum <= k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }


    static int subarraySum2(int[] arr, int k){
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = prefixSum[j] - (i > 0 ? prefixSum[i - 1] : 0);

                if (sum <= k) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }

        return maxlen;
    }


    static int longest_subarray3(int[] arr, int k){
        int maxlength = 0;
        int n = arr.length;
        int left = 0;
        int p_sum = 0;
        for(int right=0; right<n; right++){
            p_sum += arr[right];
            while(p_sum > k){
                p_sum -= arr[left];
                left++;
            }

                maxlength = Math.max(maxlength, right-left+1);

        }
        return maxlength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        input_array(arr, sc);
        System.out.print("Enter the sum k: ");
        int k = sc.nextInt();

        //Brute-force approach
        //time complexity = O(n^2)
        // space complexity = O(1)
        int len1 = longest_subarray1(arr, k, 0);
        System.out.println("Longest Subarray with given Sum K is: " +len1);


        //time complexity = 
        // space complexity = 
        int len2 = subarraySum2(arr, k);
        System.out.println("Longest Subarray with given Sum K is: " +len2);
        

        //Optimal approach
        //time complexity = O(n)
        // space complexity = O(1)
        int len3 = longest_subarray3(arr, k);
        System.out.println("Longest Subarray with given Sum K is: " +len3);
    }
}
