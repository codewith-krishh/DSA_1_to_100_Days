// Left rotate array by 1

package Day3_Arrays_Intermediate;

import java.util.Scanner;

public class problem_02 {

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
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
// Time complexity = O(n)
// Space Complexity = O(n) [or = O(1) if array is given]
