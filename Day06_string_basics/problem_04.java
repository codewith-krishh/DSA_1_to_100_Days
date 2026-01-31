// Valid anagram

package Day06_string_basics;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class problem_04 {

    static boolean checkAnagram1(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] arr = t.toCharArray();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            boolean flag = false;
            for(int j=0; j<t.length(); j++){
                if(ch == arr[j]){
                    arr[j] = '#';
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }


    static boolean checkAnagram2(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }


    static boolean checkAnagram3(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i) - 'a']--;
            if(freq[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
       return true;
    }



    static boolean checkAnagram4(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch, map.get(ch)-1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String s = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String t = sc.nextLine();

        // brute-force approach
        // time complexiy = O(n^2)
        // space complexity = O(n)
        boolean check1 = checkAnagram1(s, t);
        if(check1){
            System.out.println("Yes, it is anagram");
        }
        else{
            System.out.println("No, it's not a anagram");
        }



        // better approach
        // time complexity = O(n log n)
        // space complexity = O(n)
        boolean check2 = checkAnagram2(s, t);
        if(check2){
            System.out.println("Yes, it is anagram");
        }
        else{
            System.out.println("No, it's not a anagram");
        }


        // optimal approach(for small-case letters)
        // time complexity = O(n)
        // space complexity = O(1)
        boolean check3 = checkAnagram3(s,t);
        if(check3){
            System.out.println("Yes, it is anagram");
        }
        else{
            System.out.println("No, it's not a anagram");
        }


        // optimal approach(for all cases and symbol)
        // time complexity = O(n)
        // space complexity = O(n)
        boolean check4 = checkAnagram4(s,t);
        if(check4){
            System.out.println("Yes, it is anagram");
        }
        else{
            System.out.println("No, it's not a anagram");
        }
        sc.close();
    }
}
