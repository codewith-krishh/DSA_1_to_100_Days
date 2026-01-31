// Count vowels & consonants
package Day06_string_basics;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s= sc.nextLine(); 
        s = s.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
            }
        }
        System.out.println("No. of vowels in this string: " +vowels);
        System.out.println("No. of consonants in this string: " +consonants);
        sc.close();
    }
}
// time complexity = O(n)
// space complexity = O(1)