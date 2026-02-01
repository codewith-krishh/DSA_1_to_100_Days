// Find maximum in array recursively

package Day13_Recursion_on_Arrays;

import java.util.Scanner;

public class problem_04 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static int MaxNumRecursion(int[] arr, int index, int max){
        if(index == arr.length) return max;
        max = Math.max(arr[index], max);
        return MaxNumRecursion(arr, index+1, max);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        int target = Integer.MIN_VALUE;
        int max = MaxNumRecursion(arr, 0, target);
        System.out.println("The maximum number in the given array is: " +max);
    }
}
