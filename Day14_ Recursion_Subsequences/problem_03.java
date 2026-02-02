// Count subsequences with sum K

import java.util.Scanner;

public class problem_03 {


    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static int printSubsequences(int[] arr, int index, int target, int currSum){

        if(index == arr.length){
            return (currSum == target) ? 1 : 0;
        }

        int left = printSubsequences(arr, index+1, target, currSum+arr[index]);

        int right = printSubsequences(arr, index+1, target, currSum);
         
        return left+right;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the sum element: ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        int cnt = printSubsequences(arr, 0, x, 0);
        System.out.println("Total subsequences with sum K: " +cnt);
        sc.close();
    }
}

// time complexity = O(2^n)
// space complexity = O(n)