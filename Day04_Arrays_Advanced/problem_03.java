// Move all zeros to end
package Day4_Arrays_Advanced;

import java.util.Scanner;

    public class problem_03 {
     static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void PrintArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    static void Remove_zero1(int[] arr, int n){
        int[] updated_array = new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                updated_array[j++] = arr[i];
            }
        }
        for(int k=j; k<n; k++){
            updated_array[k] = 0;
        }
        PrintArray(updated_array);
    }


    static void Remove_zero2(int[] arr, int n){
        int j = 0; // position for next non-zero
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            }
        }
        PrintArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);

        // brute-force method
        Remove_zero1(arr,n);
        // Time complexity = O(n)
        // Space complexity = O(n)

        // optimal approach
        Remove_zero2(arr,n);
        // Time complexity = O(n)
        // Space complexity = O(1)
    }
}
