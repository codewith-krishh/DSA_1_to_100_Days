// Check rotation of string
package Day07_strings_patterns;

public class problem_03 {

    static boolean rotateString(String s, String goal){
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;  
            }
        }

        return false;
    }

    static boolean rotateStringOptimized(String s, String goal){
        if (s.length() != goal.length()) {
            return false;
        }

        String combineString = s+s;

        return combineString.contains(goal);
    }

    public static void main(String[] args) {
        String s1 = "rotation";
        String goal1 = "tionrota";

        // brute force
        // time complexity - O(N^2)
        // space complexity - O(N)
        System.out.println(rotateString(s1, goal1));

        // optimal force
        // time complexity - O(N)
        // space complexity - O(N)
        System.out.println(rotateStringOptimized(s1, goal1));
    }
}
