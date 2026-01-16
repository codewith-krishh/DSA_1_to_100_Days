// Left rotate array by K
package Day3_Arrays_Intermediate;

import java.util.Scanner;

public class problem3 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void ReverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();
        k = k%n;
        // Brute force approach
        // for(int i=0; i<k; i++){
        //     int temp = arr[0];
        //     for(int j=1; j<n; j++){
        //         arr[j-1] = arr[j];
        //     }
        //     arr[n-1] = temp;
        // }

        // Optimal Approach
        ReverseArray(arr, 0, k-1);
        ReverseArray(arr, k, n-1);
        ReverseArray(arr, 0, n-1);


        System.out.println("Rotated array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
// Time complexity = O(n)
// Space Complexity = O(n) [or = O(1) if array is given]
