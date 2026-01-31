// Check palindrome using recursion

package Day12_Functional_vs_Parameterized;
import java.util.Scanner;

public class problem_04 {

    static boolean checkPalindrome(String str, int left, int right){
        if(left >= right) return true;
        if(str.charAt(left) != str.charAt(right)) return false;
        return checkPalindrome(str, left+1, right-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        boolean check = checkPalindrome(str,0,str.length()-1);

        if(check) System.out.println("Yes, it's a palindrome");
        else System.out.println("No, it's not a palindrom");
        sc.close();
    }
}

// time complexity = O(n)
// space complexity = O(n) {due to recursive stack}