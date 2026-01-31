// Longest Subarray with given Sum K(Positives)
package Day4_Arrays_Advanced;

import java.util.Scanner;

public class problem_04 {

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
                if(sum == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }

    static int longest_subarray2(int[] arr, int k){
        int maxlength = 0;
        int n = arr.length;
        int left = 0, right = 0;
        int p_sum = 0;
        while(right < n){
            while(p_sum > k){
                p_sum -= arr[left];
                left++;
            }

            if(p_sum == k){
                maxlength = Math.max(maxlength, right-left+1);
            }

            right++;
            if(right<n){
            p_sum += arr[right];
            }

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
        int len1 = longest_subarray1(arr, k, 0);
        System.out.println("Longest Subarray with given Sum K is: " +len1);
        //time complexity = O(n^2)
        // space complexity = O(1)

        //Optimal approach
        int len2 = longest_subarray2(arr, k);
        System.out.println("Longest Subarray with given Sum K is: " +len2);
    }
}
