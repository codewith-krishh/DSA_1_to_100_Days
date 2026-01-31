// Remove outermost parentheses

package Day07_strings_patterns;
import java.util.Scanner;

public class problem_01 {

    static String removeOuterParentheses(String s){
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(counter > 0) result.append(ch);
                counter++;
            }
            else if(ch == ')'){
                counter--;
                if(counter > 0) result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String result = removeOuterParentheses(s);
        System.out.print("The result is: " +result);

        sc.close();
    }
}
// time complexity = O(n)
// space complexity = O(n)