// Reverse a string

package Day6_string_basics;
import java.util.Scanner;
public class problem_01 {

    static void reverseString(String s){
            for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        reverseString(s);

        sc.close();
    }
}
// time complexity = O(n)
// space complexity = O(1)