// Longest common prefix
package Day07_strings_patterns;

import java.util.Arrays;

public class problem_02 {
    static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();

        // Sort the array of strings
        Arrays.sort(v);

        String first = v[0];

        String last = v[v.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
    public static void main(String[] args) {

        String[] input = {"interview", "internet", "internal", "interval"};

        String result = longestCommonPrefix(input);

        // Print the longest common prefix
        System.out.println("Longest Common Prefix: " + result); 
    }
}
// time complexity - O(M)
// space complexity - O(N * log N + M