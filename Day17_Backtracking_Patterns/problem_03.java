// Palindrome partitioning
package Day17_Backtracking_Patterns;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_03 {


    static List<List<String>> palindromePartitioning(String s){
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, res);
        return res;
    }

    static void func(int index, String s, List<String> path, List<List<String>> res){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=index; i<s.length(); i++){
            if(isBoolean(s, index, i)){
                path.add(s.substring(index, i+1));
                func(i + 1, s, path, res);
                path.remove(path.size()-1);
            }
        }
    }


    static boolean isBoolean(String s, int start, int end){
        while (start <= end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(palindromePartitioning(str));
        sc.close();
    }
}
