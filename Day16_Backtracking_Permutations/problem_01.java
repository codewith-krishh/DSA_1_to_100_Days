package Day16_Backtracking_Permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_01 {


    static void permutation(int[] arr, boolean[] used, List<Integer> current, List<List<Integer>> result){
        if(current.size() == arr.length){
            result.add(new ArrayList<>());
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(used[i]) continue;
            
            used[i] = true;
            current.add(arr[i]);

            permutation(arr, used, current, result);

            current.remove(current.size() - 1);
            used[i] = false;
        }    
    }






    static void permute(int index, int[] arr, List<List<Integer>> result) {

        
        if (index == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) temp.add(x);
            result.add(temp);
            return;
        }

        for (int i = index; i < arr.length; i++) {

            swap(arr, index, i);

            permute(index + 1, arr, result);

            // backtrack
            swap(arr, index, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        List<List<Integer>> result = new ArrayList<>();


        // brute force approach
        // time complexity = O(n! * n)
        // space complexity = O(n! * n)
        permutation(arr, new boolean[n], new ArrayList<>(), result);
        System.out.println("Permutations:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }


        // optimal approach
        // time complexity = O(n! * n)
        // space complexity = O(n)
        permute(0, arr, result);
        System.out.println("Permutations:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
        sc.close();
    }
}
