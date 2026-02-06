package Day17_Backtracking_Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Letter combinations of phone number

public class problem_01 {

    static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;

        String[] map = {
            "",            //0
            "",            //1
            "abc",         //2
            "def",         //3
            "ghi",         //4
            "jkl",         //5
            "mno",         //6
            "pqrs",        //7
            "tuv",         //8
            "wxyz"         //9
        };

        backtrack(0, digits, new StringBuilder(), result, map);
        return result;
    }

    static void backtrack(int index, String digits, StringBuilder path, List<String> result, String[] map){
        if(index == digits.length()){
            result.add(path.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = map[digit];

        for(int i=0; i<letters.length(); i++){
            path.append(letters.charAt(i));
            backtrack(index + 1, digits, path, result, map);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(letterCombinations(str));
        sc.close();

    }
}


// time complexity = O(4^n)
// space complexity = O(n)