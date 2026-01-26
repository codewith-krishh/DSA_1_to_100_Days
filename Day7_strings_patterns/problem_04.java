// First non-repeating character
package Day7_strings_patterns;

import java.util.HashMap;
import java.util.Scanner;

public class problem_04 {

    static char firstNonRepeatingChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        
        // No non-repeating character found
        return '_';  
    }

    static char firstNonRepeatingCharLowerCase(String s) {
        int[] freq = new int[26];
        
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }
        
        return '_';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Time Complexity: O(n)
        // Space Complexity: O(k)
        System.out.println("First non-repeating character: " +firstNonRepeatingChar(s));

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        System.out.println("First non-repeating character: " +firstNonRepeatingCharLowerCase(s));
        sc.close();
    }
}
