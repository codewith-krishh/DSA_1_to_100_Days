// Combination Sum I (unlimited)

package Day15_Recursion_Combinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_01 {
    

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static void combinationSum(int[] arr, int index, List<Integer> current, int target){

        if(target == 0){
            System.out.println(current);
            return;
        }

        if(index == arr.length){
            return;
        }

        if(arr[index] <= target){
            current.add(arr[index]);
            combinationSum(arr, index, current, target-arr[index]);
            current.remove(current.size() - 1);
        }


        combinationSum(arr, index+1, current, target);
        
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the sum element: ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        combinationSum(arr, 0, new ArrayList<>(),x);
        sc.close();
    }
}

// time complexity = O(2^t)
// space complexity = O(t)
// Subset Sum I
// Subset Sum II (no duplicates)