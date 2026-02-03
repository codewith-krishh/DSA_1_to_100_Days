// Combination Sum II (limited, duplicates)

package Day15_Recursion_Combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class problem_02 {


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

        
        current.add(arr[index]);
        combinationSum(arr, index+1, current, target-arr[index]);
        current.remove(current.size() - 1);
    

        int nextIndex = index + 1;
        while (nextIndex < arr.length && arr[nextIndex] == arr[index]) {
            nextIndex++;
        }
        combinationSum(arr, nextIndex, current, target);
        
        
    }

      
    
    static void combinationSumOptimized(int[] arr, int index, List<Integer> current, int target){
        if (target == 0) {
            System.out.println(current);
            return;
        }

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) continue;

            if (arr[i] > target) break;

            current.add(arr[i]);
            combinationSumOptimized(arr, i + 1, current, target - arr[i]);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the sum element: ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        Arrays.sort(arr);

        // brute force approach
        // time complexity = O(2^n)
        // space complexity = O(n)
        combinationSum(arr, 0, new ArrayList<>(),x);


        // optimal approach
        // time complexity = O(2^n)
        // space complexity = O(n)
        combinationSumOptimized(arr, 0, new ArrayList<>(),x);

       sc.close();
    }
    
}
