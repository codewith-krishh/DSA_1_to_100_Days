// Longest Subarray with sum K | [Postives and Negatives]



package Day4_Arrays_Advanced;

import java.util.HashMap;
import java.util.Map;

public class problem_05 {

     static int getLongestSubarray(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> preSumMap = new HashMap<>(); 
        int sum = 0;      
        int maxLen = 0;   

        for (int i = 0; i < n; i++) {
            sum += a[i];

            // Case 1: If full subarray from 0 to i has sum = k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem); // Length of current valid subarray
                maxLen = Math.max(maxLen, len);
            }

            // Store the first occurrence of a prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1 };
        int k = 1;

        int len = getLongestSubarray(a, k);

        System.out.println("The length of the longest subarray is: " + len);
    }
}
