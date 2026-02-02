// Print all subsequences of array

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


    static void printSubsequences(int[] arr, int index, List<Integer> current){

        if(index >= arr.length){
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        printSubsequences(arr, index+1, current);

        current.remove(current.size() - 1);
        printSubsequences(arr, index+1, current);
        
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        printSubsequences(arr, 0, new ArrayList<>());
        sc.close();
    }
}
// time complexity = O(n*(2^n))
// space complexity = O(n)