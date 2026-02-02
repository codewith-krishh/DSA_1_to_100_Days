// Print one subsequence with sum K

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_04 {
    
    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static boolean printSubsequences(int[] arr, int index, List<Integer> current, int target, int currSum){

        if(index >= arr.length){
            if(currSum == target) {
            System.out.println(current);
            return true;
            }
            return false;
        }

        current.add(arr[index]);
        if(printSubsequences(arr, index+1, current, target, currSum+arr[index])) return true;

        current.remove(current.size() - 1);
        if (printSubsequences(arr, index+1, current, target, currSum)) return true;

        return false;
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the sum element: ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        printSubsequences(arr, 0, new ArrayList<>(),x, 0);

    }
}

// time complexity = O(2^n)
// space complexity = O(n)