// Generate valid parentheses
// Palindrome partitioning
// Word search in grid
package Day17_Backtracking_Patterns;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_02 {


    static void backtrack(String curr, int open, int close, int n, List<String> res) {
        if (curr.length() == 2 * n) {
            res.add(curr);
            return;
        }
        if (open < n) backtrack(curr + "(", open + 1, close, n, res);
        if (close < open) backtrack(curr + ")", open, close + 1, n, res);
    }


    static List<String> generateParenthesis2(int n) {
        List<String> res = new ArrayList<>();
        backtrack("", 0, 0, n, res);
        return res;
    }


    static boolean isValid(String s){
        int balance = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') balance++;
            else balance--;
            if(balance<0) return false;
        }

        return balance == 0;
    }

    static void generateAll(String curr, int n, List<String> res){
        if(curr.length() == 2*n){
            if(isValid(curr)) res.add(curr);
            return;
        }
        generateAll(curr + "(", n, res);
        generateAll(curr + ")", n, res);
    }


    static List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        generateAll("", n, res);
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        // brute force approach
        // time complexity =  O(2^(2n) * n)
        // space complexity = O(n)
        List<String> result = generateParenthesis(n);
        for (String s : result) {
            System.out.println(s);
        }

        // optimal approach
        // time complexity = O(C(n) × n)
        // space complexity = O(C(n) × n)
        List<String> result2 = generateParenthesis2(n);
        for (String s : result2) {
            System.out.println(s);
        }
        for(String s: result2) System.out.println(s);
        sc.close();
    }
}

