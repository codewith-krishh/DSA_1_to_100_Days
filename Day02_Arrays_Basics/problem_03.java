// Check if array is sorted(ascending)
package Day2_Arrays_Basics;

import java.util.Scanner;

public class problem_03 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    } 

    static boolean IsArraySorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr,sc);
        boolean result = IsArraySorted(arr);
        if(result) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");

        sc.close();
    }
}
// Time complexity = O(n)
// Space Complexity = O(1)