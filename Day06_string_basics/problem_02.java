// Check palindrome

package Day06_string_basics;
import java.util.Scanner;

public class problem_02 {

    static String checkPalindrome(String s){
        StringBuilder r = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            r.append(s.charAt(i));
        }
        return r.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s= sc.nextLine();
        sc.close();

        // brute force approach
        // time complexity = O(n)
        // space complexity = O(n)
        String reverse = checkPalindrome(s);
        if(s.equals(reverse)){
            System.out.println("Yes, the given string is palindrome");
        }
        else{
            System.out.println("No, the given string is not palindrome");
        }

        // optimal approach
        // time complexity = O(n)
        // space complexity = O(1)
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("It's a palindrome");

        
    }
}
