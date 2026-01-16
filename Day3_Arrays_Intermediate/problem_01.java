// Remove duplicates from sorted array

package Day3_Arrays_Intermediate;

import java.util.Scanner;

public class problem_01 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        int k=1;
        for(int i=1; i<n; i++){
            if(arr[i-1] != arr[i]){
                arr[k++] = arr[i];
            }
        }
        for(int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
// Time complexity = O(n)
// Space Complexity = O(n) [or = O(1) if array is given]
