// Prefix sum implementation
package Day02_Arrays_Basics;

public class problem_05 {

    static void PrintArray(int[] prefix_sum){
        for(int i=0; i<prefix_sum.length; i++){
            System.out.print(prefix_sum[i] + " ");
        }
    }

    static int[] PrefixSum(int[] arr){
        int[] p_sum = new int[arr.length];
        p_sum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            p_sum[i] = p_sum[i-1] + arr[i];
        }
        return p_sum;
    }

// OR(INPLACE)
    // static int[] PrefixSum(int[] arr){
    //     for(int i=1; i<arr.length; i++){
    //         arr[i] += arr[i-1];
    //     }
    //     return arr;
    // }
// Time complexity = O(n)
// Space Complexity = O(1)


    public static void main(String[] args) {

        System.out.println("Enter number of elements:");
        int[] arr = {2, 5, 3, 1, 7};
        int[] prefix_sum = PrefixSum(arr);
        PrintArray(prefix_sum);
    }
}
// Time complexity = O(n)
// Space Complexity = O(n)